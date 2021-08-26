package ConnectionDB;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmployees {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("config.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try{
            int empid = 2;
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp1 = session.get(Employee.class, empid);
            emp1.setFirstName("Hema");
            emp1.setLastName("Acharya");
            emp1.setCompany("Prosper");

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
