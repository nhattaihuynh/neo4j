package com.neo4j.repository;

import com.neo4j.entity.Student;

import java.util.List;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends Neo4jRepository<Student, Long> {
    List<Student> findByName(String name);

    List<Student> findByNameAndCountry(String name, String country);
    
    @Query("MATCH (s:Student) WHERE s.name = $name OR s.country = $country RETURN s")
    List<Student> getByNameOrCountry(String name, String country);

    @Query("MATCH (s:Student) WHERE s.name ENDS WITH 'son' RETURN s")
    List<Student> findByNameEndingWithSon();
}
