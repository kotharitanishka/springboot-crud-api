package com.udemycourse.demo.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udemycourse.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    //define @PostConstruct to load the student data.. only once
    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
    }

    //define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {   

        return theStudents;
    }

    // DEFINE ENDPOINT TO RETURN STUDENT BY ID
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        // just index into list 
        //check the studentId against the list size
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student Id not found - " + studentId);
        }

        return theStudents.get(studentId);
    }
   
    
}
