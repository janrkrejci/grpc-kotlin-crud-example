package com.janrkrejci.examples;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\"\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/janrkrejci/examples/HealthEndpoint;", "Lio/grpc/health/v1/HealthGrpc$HealthImplBase;", "()V", "healthStatusManager", "Lio/grpc/services/HealthStatusManager;", "check", "", "request", "Lio/grpc/health/v1/HealthCheckRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lio/grpc/health/v1/HealthCheckResponse;", "watch", "grpc-micronaut-crud"})
@javax.inject.Singleton()
public final class HealthEndpoint extends io.grpc.health.v1.HealthGrpc.HealthImplBase {
    private final io.grpc.services.HealthStatusManager healthStatusManager = null;
    
    @java.lang.Override()
    public void check(@org.jetbrains.annotations.Nullable()
    io.grpc.health.v1.HealthCheckRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<io.grpc.health.v1.HealthCheckResponse> responseObserver) {
    }
    
    @java.lang.Override()
    public void watch(@org.jetbrains.annotations.Nullable()
    io.grpc.health.v1.HealthCheckRequest request, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<io.grpc.health.v1.HealthCheckResponse> responseObserver) {
    }
    
    public HealthEndpoint() {
        super();
    }
}