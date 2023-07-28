package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.EmployeeV3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeV3.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 500, 1500);
//            EmployeeV3 employeeV3 = new EmployeeV3("Oleg", "Ivanov",
//                    800);
//            EmployeeV3 employeeV3_2 = new EmployeeV3("Andery", "Sidorov",
//                    1000);
//
//            department.addEmployeeToDepartment(employeeV3);
//            department.addEmployeeToDepartment(employeeV3_2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 3);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 2);

            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
