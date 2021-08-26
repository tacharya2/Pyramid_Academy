package ConnectionDB;

import entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryEmployee {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("config.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee").getResultList();
            showInfo(employees);

            employees = session.createQuery("from Employee e where e.firstName = 'Hema'").getResultList();
            showInfo(employees);

            employees = session.createQuery("from Employee e where e.company LIKE 'GenSpark'").getResultList();
            showInfo(employees);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
    private static void showInfo(List<Employee> employees){

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}

