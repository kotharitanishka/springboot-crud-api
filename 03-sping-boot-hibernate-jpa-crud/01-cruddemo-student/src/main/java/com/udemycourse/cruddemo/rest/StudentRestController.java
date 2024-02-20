package com.udemycourse.cruddemo.rest;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.udemycourse.cruddemo.dao.StudentDAO;
import com.udemycourse.cruddemo.dao.StudentDAOImpl;
import com.udemycourse.cruddemo.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentDAO s;


    public StudentRestController (StudentDAO st) {
        s = st ;
    }

    @GetMapping(value = "/students")
    public List<Student> findAll() {
        return s.findAll();
    }

    @GetMapping("/students/{studentId}")
    public Student findStudentById(@PathVariable int studentId) {
        return s.findById(studentId);
    }

    // @GetMapping("/students/{studentName}")
    // public Student findStudentByFirstName(@PathVariable String studentName) {
    //     return s.findByName(studentName) ;
    // }

    // @DeleteMapping("/students/{studentId}")
    // public void deleteStudentById(@PathVariable int studenId) {
    //     s.delete(studenId);
    //}

}
