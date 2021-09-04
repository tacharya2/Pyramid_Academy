package com.company.Create;

import com.company.Entiry.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Read {
    // I want to get details about myself
    public Read() {
    }
/*
1. Find an element to read for example name.
2. beginTransaction
3. get id to read
4. retrieve all the info about the element
5. display it in the console
 */
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            System.out.println("Enter id: ");
            Scanner scan = new Scanner(System.in);
            int personId = scan.nextInt();
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Person thisPerson = (Person)session.get(Person.class, personId);
            thisPerson.getUsername();
            session.getTransaction().commit();
            System.out.println(thisPerson.getPassword());

        }finally {
            session.close();
        }
    }
}
