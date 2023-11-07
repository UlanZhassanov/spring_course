package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.EnumMap;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            deprecated
//            List<Employee> emps = session.createQuery("from Employee").getResultList();

//            новый правильный способ
//            List<Employee> emps = session.createQuery("from Employee", Employee.class).getResultList();

            List<Employee> emps = session.createQuery("from Employee where name = 'Ulan' AND salary > 500").getResultList();

            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
