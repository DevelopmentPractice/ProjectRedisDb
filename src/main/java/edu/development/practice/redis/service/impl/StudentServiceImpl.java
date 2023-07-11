package edu.development.practice.redis.service.impl;

import edu.development.practice.redis.Entity.Student;
import edu.development.practice.redis.repository.StudentRepository;
import edu.development.practice.redis.request.StudentRequest;
import edu.development.practice.redis.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public Student insert(StudentRequest request) {
        Student student =
                new Student(request.getId(), request.getName(), request.getGender().equalsIgnoreCase("MALE") ? Student.Gender.MALE : Student.Gender.FEMALE, request.getGrade());

        return studentRepository.save(student);
    }

    @Override
    public Student get(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void delete(String id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.deleteById(student.getId());
    }
}
