package com.janrkrejci.examples

import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import io.micronaut.core.async.publisher.AsyncSingleResultPublisher
import io.micronaut.core.util.CollectionUtils
import io.micronaut.core.util.StringUtils
import io.micronaut.grpc.server.GrpcEmbeddedServer
import io.micronaut.grpc.server.GrpcServerConfiguration
import io.micronaut.health.HealthStatus
import io.micronaut.management.health.indicator.HealthIndicator
import io.micronaut.management.health.indicator.HealthResult
import org.reactivestreams.Publisher
import javax.inject.Singleton

@Singleton
@Requires(property = GrpcServerConfiguration.PREFIX + ".health.enabled", value = StringUtils.TRUE, defaultValue = StringUtils.TRUE)
@Requirements(Requires(beans = [io.micronaut.management.endpoint.health.HealthEndpoint::class]))
class GrpcServerHealthIndicator

/**
 * Default constructor.
 *
 * @param server The grpc embedded server
 */(private val server: GrpcEmbeddedServer) : HealthIndicator {

    override fun getResult(): Publisher<HealthResult> {
        return AsyncSingleResultPublisher { healthResult }
    }

    /**
     * Checks if grpc is running and return status UP otherwise return status DOWN.
     *
     * @return Result with server address in the details and status UP or DOWN.
     */
    private val healthResult: HealthResult
        get() {
            val healthStatus = if (server.isRunning) HealthStatus.UP else HealthStatus.DOWN
            return HealthResult
                    .builder(ID, healthStatus)
                    .details(
                            CollectionUtils.mapOf(
                                    "host", server.host,
                                    "port", server.port,
                                    "services", server.server.services.map {
                                it.serviceDescriptor.name
                            }
                            )
                    )
                    .build()
        }

    companion object {
        private const val ID = "grpc-server"
    }
}