package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Department department = new Department("Sales", 8000, 100);
//            Employee employee1 = new Employee("Dominick", "Decoco", 6000);
//            Employee employee2 = new Employee("Antonio", "Margareiti", 100);
//            Employee employee3 = new Employee("Cliff", "Booth", 1000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);

            session.beginTransaction();
//            session.save(department);
            System.out.println("Get department");
            Department department = session.get(Department.class, 6);

            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Show employees of department");
            System.out.println(department.getEmployeeList());

            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
