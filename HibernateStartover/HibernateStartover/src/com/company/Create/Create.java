package com.company.Create;

import com.company.Entiry.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Create {
    /*
    1. Open session factory
    2. getCurrent session
    3. try{
    create entity instance
    4. begin transaction
    5. save the instances
    6. commit transaction
    }finally
    close factory
     */

    public Create() {
    }

    public static void main(String[] args) {

        SessionFactory sessionFactory = (new Configuration()).configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        String id = scanner.next();
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        try {
            Person person = new Person(Integer.valueOf(id), firstName, lastName, username, password);
//            Person hema = new Person(2, "Hema", "Acharya", "hacharya", "Papayak12");
//            Person prajol = new Person(3, "Prajol", "Acharya", "pacharya", "Papayak1");
//            Person prinsa = new Person(4, "Prinsa", "Acharya", "pracharya", "Papayak");


            session.beginTransaction();
            session.save(person);
//            session.save(hema);
//            session.save(prajol);
//            session.save(prinsa);

            Person thisPerson = session.get(Person.class, person.getId());
            System.out.println(thisPerson.getFirstName());
            session.getTransaction().commit();

        } finally {
            session.close();
        }
    }
}
