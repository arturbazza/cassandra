package org.fundatec.cassandra.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfig {

    @Bean
    public CqlSession cassandraSession() {
        return CqlSession.builder()
                .withKeyspace("pop_music")  // Especifica o keyspace no momento da criação da sessão
                .withLocalDatacenter("datacenter1")
                .build();
    }
}
