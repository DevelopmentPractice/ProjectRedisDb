package edu.development.practice.redis.service;

import edu.development.practice.redis.Entity.Student;
import edu.development.practice.redis.request.StudentRequest;

public interface StudentService {

    Student insert(StudentRequest request);

    Student get(String id);

    void delete(String id);

}
