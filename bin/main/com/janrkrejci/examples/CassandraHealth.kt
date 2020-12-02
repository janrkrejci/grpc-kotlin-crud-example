package com.janrkrejci.examples

import com.datastax.oss.driver.api.core.CqlSession
import io.micronaut.configuration.cassandra.health.CassandraHealthIndicator
import javax.inject.Singleton

@Singleton
class CassandraHealth(cqlSession: CqlSession?): CassandraHealthIndicator(cqlSession) {

}