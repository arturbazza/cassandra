package org.fundatec.cassandra.repository;

import org.fundatec.cassandra.model.PopDivas;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PopDivasRepository extends CassandraRepository<PopDivas, UUID> {
}
