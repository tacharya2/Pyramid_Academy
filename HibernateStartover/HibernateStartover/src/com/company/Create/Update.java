package com.company.Create;

import com.company.Entiry.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
    public Update() {
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            Integer personId = 5;
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Person thisPerson = (Person) session.get(Person.class, personId);
            thisPerson.setLastName("Sharma");
            session.getTransaction().commit();
            System.out.println(thisPerson.getLastName());

        } finally {
            session.close();
        }
    }
}
