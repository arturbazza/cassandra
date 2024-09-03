package org.fundatec.cassandra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("pop_divas")
public class PopDivas {

    @PrimaryKey
    private UUID divaId;

    @Column("name")
    private String name;

    @Column("debut_year")
    private int debutYear;

    @Column("genre")
    private String genre;
}
