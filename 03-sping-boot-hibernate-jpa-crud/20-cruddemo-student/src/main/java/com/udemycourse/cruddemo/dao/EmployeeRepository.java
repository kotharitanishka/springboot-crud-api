package com.udemycourse.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemycourse.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer>{
    
}
