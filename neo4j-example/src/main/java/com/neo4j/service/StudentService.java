package com.neo4j.service;

import com.neo4j.entity.Student;
import com.neo4j.repository.DepartmentRepository;
import com.neo4j.repository.StudentRepository;
import com.neo4j.repository.SubjectRepository;
import com.neo4j.request.StudentRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    private final DepartmentRepository departmentRepository;

    private final SubjectRepository subjectRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, DepartmentRepository departmentRepository, SubjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
        this.subjectRepository = subjectRepository;
    }

    public Student createStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setAge(studentRequest.getAge());
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
