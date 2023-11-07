package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Tinkoff", "Sales", 1000);
//            Detail detail = new Detail("Moscow", "8777777777", "somnitelnonook@mail.com");
//            employee.setEmpDetail(detail);

            session.beginTransaction();
//            session.save(employee);

            Employee employee = session.get(Employee.class, 1);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
