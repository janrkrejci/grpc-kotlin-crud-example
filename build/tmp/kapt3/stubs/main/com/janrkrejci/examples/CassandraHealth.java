package com.janrkrejci.examples;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/janrkrejci/examples/CassandraHealth;", "Lio/micronaut/configuration/cassandra/health/CassandraHealthIndicator;", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "(Lcom/datastax/oss/driver/api/core/CqlSession;)V", "grpc-micronaut-crud"})
@javax.inject.Singleton()
public final class CassandraHealth extends io.micronaut.configuration.cassandra.health.CassandraHealthIndicator {
    
    public CassandraHealth(@org.jetbrains.annotations.Nullable()
    com.datastax.oss.driver.api.core.CqlSession cqlSession) {
        super(null);
    }
}