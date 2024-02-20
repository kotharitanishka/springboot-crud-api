package com.udemycourse.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.udemycourse.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.OptimisticLockException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{


    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional
    public void save(Student thestudent) {
        entityManager.persist(thestudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("SELECT s FROM Student s").getResultList();
    }

    @Override
    public Student findByName(String n) {
        return (Student) entityManager.createQuery("from Student s where s.firstName=:name")
        .setParameter("name", n).getSingleResult() ;
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        int isSuccessful = entityManager.createQuery("delete from Student s where s.id=:id")
        .setParameter("id", id).executeUpdate();
        if (isSuccessful == 1) {
            System.out.println("deleted student with id : " + id);
            }
        else {
            System.out.println("delete unsuccessful");
        }
    }

    @Override
    @Transactional
    public Student updateFirstName(Integer id, String n) {
        entityManager.createQuery("update Student s set s.firstName=:name where s.id=:id").setParameter("name", n).setParameter("id", id).executeUpdate();
        return findById(id);

    }
    
}
