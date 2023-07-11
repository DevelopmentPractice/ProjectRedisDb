package edu.development.practice.redis.controller;

import edu.development.practice.redis.Entity.Student;
import edu.development.practice.redis.request.StudentRequest;
import edu.development.practice.redis.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/crud")
public class StudentController {

    private final StudentService studentService;

    @PostMapping(value = "/insert")
    public ResponseEntity<Student> insert(@RequestBody StudentRequest request) {
        return new ResponseEntity<>(studentService.insert(request), HttpStatus.OK);
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Student> insert(@PathVariable(value = "id") String id) {
        return new ResponseEntity<>(studentService.get(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id") String id) {
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
