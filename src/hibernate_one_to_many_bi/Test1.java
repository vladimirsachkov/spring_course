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
//            Department department = new Department("IT", 300, 1200);
//            EmployeeV3 employeeV3 = new EmployeeV3("Zaur", "Tregulov",
//                    800);
//            EmployeeV3 employeeV3_2 = new EmployeeV3("Elena", "Smirnova",
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
//            EmployeeV3 employeeV3 = session.get(EmployeeV3.class, 1);
//
//            System.out.println(employeeV3);
//            System.out.println(employeeV3.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *************************************************************************
            session = factory.getCurrentSession();

            session.beginTransaction();

            EmployeeV3 employeeV3 = session.get(EmployeeV3.class, 4);

            session.delete(employeeV3);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
