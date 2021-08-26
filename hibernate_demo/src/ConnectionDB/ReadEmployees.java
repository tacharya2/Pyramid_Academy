package ConnectionDB;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployees {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("config.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            int empId = 1;

            System.out.println("Retrieving the info of the employee with id " + empId);

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee thisEmployee = session.get(Employee.class, empId);
            System.out.println("The name of the employee is: " + thisEmployee.getFirstName());

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
