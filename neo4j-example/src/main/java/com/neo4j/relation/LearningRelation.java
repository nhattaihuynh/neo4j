package com.neo4j.relation;

import com.neo4j.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LearningRelation {
    @Id
    @GeneratedValue
    private Long id;
    @TargetNode
    private Subject subject;
    private int mark;
}
