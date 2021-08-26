package ConnectionDB;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmployees {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("config.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            int empid = 3;
            session.beginTransaction();
            session = factory.getCurrentSession();

            Employee employee = session.get(Employee.class, empid);
            session.delete(employee);
            System.out.println(employee.getFirstName() + " removed");
            // Using query
           // session.createQuery("delete from Employee where id = 3").executeUpdate();

            session.getTransaction().commit();

        }finally {
            factory.close();
        }
    }
}