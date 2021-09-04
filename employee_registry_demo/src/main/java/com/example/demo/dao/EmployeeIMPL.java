package com.example.demo.dao;

//IMPORTANT If your code is not working your imports might be incorrect

import com.example.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeIMPL implements EmployeeDAO {
    private final EntityManager entityManager;

    //Set up constructor injection
    @Autowired
    public EmployeeIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public List<Employee> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> myQuery = currentSession.createQuery("from Employee");
        return myQuery.getResultList();
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public Employee findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Employee.class, theId);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void saveOrUpdate(Employee theEmployee) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theEmployee);
    }

    @Override
    @Transactional //Defines the scope of a single database transaction.
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Employee myEmployee = currentSession.get(Employee.class, theId);
        currentSession.delete(myEmployee);
    }
}