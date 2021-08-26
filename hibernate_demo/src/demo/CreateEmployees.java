package demo;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployees {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("config.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            Employee emp1 = new Employee("Tek","Acharya", "GenSpark" );
            Employee emp2 = new Employee("Adam","Ingram", "Pyramid Academy" );
            Employee emp3 = new Employee("Jill","Goyel", "Indeed" );

            Employee emp4 = new Employee("Boyle","Benni", "GenSpark" );
            Employee emp5 = new Employee("Maine","Lakha", "Sunrise" );
            Employee emp6 = new Employee("Youa","Vang", "LinkedIn" );

            session.beginTransaction();
            System.out.println("Transaction started!");
            session.save(emp1);
            session.save(emp2);
            session.save(emp3);
            session.save(emp4);
            session.save(emp5);
            session.save(emp6);

            session.getTransaction().commit();
            System.out.println("Successfully Saved!");

        }finally {
            factory.close();
        }
    }
}
