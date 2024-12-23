package com.neo4j.repository;

import com.neo4j.entity.Department;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DepartmentRepository extends Neo4jRepository<Department, Long> {
}
