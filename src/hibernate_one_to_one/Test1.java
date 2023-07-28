package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.EmployeeV2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(EmployeeV2.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
//            Session session = factory.getCurrentSession();
//            EmployeeV2 employeeV2 = new EmployeeV2("Zaur", "Tregulov",
//                    "It",500);
//            Detail detail = new Detail("Baku", "11234124",
//                    "zaurtregulov@gmail.com");
//
//            employeeV2.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employeeV2);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session.beginTransaction();
            EmployeeV2 employeeV2 = session.get(EmployeeV2.class, 2);
            session.delete(employeeV2);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
