package com.company.Create;

import com.company.Entiry.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
    public Delete() {
    }

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            Integer personId = 3;
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Person thisPerson = session.get(Person.class, personId);
            session.remove(thisPerson);
            session.getTransaction().commit();

        }finally {
            session.close();
        }
    }

}
