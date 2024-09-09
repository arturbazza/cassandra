package org.fundatec.cassandra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.Column;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("pop_divas") // Nome da tabela no keyspace
public class PopDivas {

    @PrimaryKey("diva_id") // Nome da coluna no Cassandra
    private UUID divaId;

    @Column("name") // Nome da coluna no Cassandra
    private String name;

    @Column("debut_year") // Nome da coluna no Cassandra
    private int debutYear;

    @Column("genre") // Nome da coluna no Cassandra
    private String genre;
}
