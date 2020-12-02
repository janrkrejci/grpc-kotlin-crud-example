package com.janrkrejci.examples;

import java.lang.System;

/**
 * Default constructor.
 *
 * @param server The grpc embedded server
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/janrkrejci/examples/GrpcServerHealthIndicator;", "Lio/micronaut/management/health/indicator/HealthIndicator;", "server", "Lio/micronaut/grpc/server/GrpcEmbeddedServer;", "(Lio/micronaut/grpc/server/GrpcEmbeddedServer;)V", "healthResult", "Lio/micronaut/management/health/indicator/HealthResult;", "getHealthResult", "()Lio/micronaut/management/health/indicator/HealthResult;", "getResult", "Lorg/reactivestreams/Publisher;", "Companion", "grpc-micronaut-crud"})
@io.micronaut.context.annotation.Requirements(value = {@io.micronaut.context.annotation.Requires(beans = {io.micronaut.management.endpoint.health.HealthEndpoint.class})})
@io.micronaut.context.annotation.Requires(property = "grpc.server.health.enabled", value = "true", defaultValue = "true")
@javax.inject.Singleton()
public final class GrpcServerHealthIndicator implements io.micronaut.management.health.indicator.HealthIndicator {
    private final io.micronaut.grpc.server.GrpcEmbeddedServer server = null;
    private static final java.lang.String ID = "grpc-server";
    @org.jetbrains.annotations.NotNull()
    public static final com.janrkrejci.examples.GrpcServerHealthIndicator.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.reactivestreams.Publisher<io.micronaut.management.health.indicator.HealthResult> getResult() {
        return null;
    }
    
    private final io.micronaut.management.health.indicator.HealthResult getHealthResult() {
        return null;
    }
    
    public GrpcServerHealthIndicator(@org.jetbrains.annotations.NotNull()
    io.micronaut.grpc.server.GrpcEmbeddedServer server) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/janrkrejci/examples/GrpcServerHealthIndicator$Companion;", "", "()V", "ID", "", "grpc-micronaut-crud"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}