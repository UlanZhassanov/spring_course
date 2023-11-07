package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Ann", "Smith", "Sales", 200);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();

//            int myID = employee.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee2 = session.get(Employee.class, 10);
            session.getTransaction().commit();

            System.out.println(employee2);
        } finally {
            factory.close();
        }
    }
}
