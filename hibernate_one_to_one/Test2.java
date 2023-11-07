package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Mike", "Tyson", "Boxing", 35000);
            Detail detail = new Detail("New-York", "87919090555", "givemeear@mail.com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();

            session.save(detail);

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
