package com.neo4j.request;

import java.util.List;

import lombok.Data;

@Data
public class StudentRequest {

    private String name;
    private int age;
    private String country;
    private DepartmentRequest department;
    private List<SubjectRequest> subjects;

}
