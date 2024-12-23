package com.neo4j.repository;

import com.neo4j.entity.Subject;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SubjectRepository extends Neo4jRepository<Subject, Long> {
}
