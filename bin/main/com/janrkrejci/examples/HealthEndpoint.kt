package com.janrkrejci.examples

import io.grpc.health.v1.HealthCheckRequest
import io.grpc.health.v1.HealthCheckResponse
import io.grpc.health.v1.HealthGrpc
import io.grpc.services.HealthStatusManager
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@Singleton
class HealthEndpoint() : HealthGrpc.HealthImplBase() {
    private val healthStatusManager = HealthStatusManager()

    override fun check(request: HealthCheckRequest?, responseObserver: StreamObserver<HealthCheckResponse>?) {
        var healthService = healthStatusManager.healthService as HealthGrpc.HealthImplBase

        return healthService.check(request, responseObserver)
    }

    override fun watch(request: HealthCheckRequest?, responseObserver: StreamObserver<HealthCheckResponse>?) {
        var healthService = healthStatusManager.healthService as HealthGrpc.HealthImplBase

        return healthService.watch(request, responseObserver)
    }

    init {
        // TODO: Definir maneira de fazer a inclusão dos services que foram incluídos no grpc server. Conforme abaixo:
        healthStatusManager.setStatus("SERVICENAME", HealthCheckResponse.ServingStatus.SERVING)
    }
}