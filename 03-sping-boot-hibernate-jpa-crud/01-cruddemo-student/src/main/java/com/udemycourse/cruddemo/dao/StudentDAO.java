package com.udemycourse.cruddemo.dao;


import java.util.List;
import com.udemycourse.cruddemo.entity.Student;

public interface StudentDAO {
    
    void save(Student thestudent);

    Student findById(Integer id);
    
    Student findByName(String n);

    List<Student> findAll();

    void delete(Integer id);

    Student updateFirstName(Integer id , String n);
}
