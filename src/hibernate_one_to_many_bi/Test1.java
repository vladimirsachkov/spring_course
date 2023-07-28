package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.EmployeeV3;
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
//            Department department = new Department("Sales", 800, 1500);
//            EmployeeV3 employeeV3 = new EmployeeV3("Zaur", "Tregulov",
//                    800);
//            EmployeeV3 employeeV3_2 = new EmployeeV3("Elena", "Smirnova",
//                    1000);
//            EmployeeV3 employeeV3_3 = new EmployeeV3("Anton", "Sidorov",
//                    1200);
//
//            department.addEmployeeToDepartment(employeeV3);
//            department.addEmployeeToDepartment(employeeV3_2);
//            department.addEmployeeToDepartment(employeeV3_3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("Подгрузим наших работников");
            department.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
// *************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            EmployeeV3 employeeV3 = session.get(EmployeeV3.class, 1);
//
//            System.out.println(employeeV3);
//            System.out.println(employeeV3.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            EmployeeV3 employeeV3 = session.get(EmployeeV3.class, 4);
//
//            session.delete(employeeV3);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
