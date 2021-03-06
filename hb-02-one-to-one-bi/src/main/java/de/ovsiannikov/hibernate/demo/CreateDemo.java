package de.ovsiannikov.hibernate.demo;

import de.ovsiannikov.hibernate.demo.entity.Instructor;
import de.ovsiannikov.hibernate.demo.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            // create the objects
            /*Instructor tempInstructor = new Instructor("Maik", "Jackson","maike@gmail.com");

            InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.maike.de/youtube", "Sport");*/
            Instructor tempInstructor = new Instructor("Jack", "Gibson", "g.gibson@googlemail.com");

            InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.underwater.de/youtube", "diving");

            // associate the object
            tempInstructor.setInstructorDetail(tempInstructorDetail);

            // start a transaction
            session.beginTransaction();

            // save the instructor object
            //
            //Note: this will ALSO save the details object
            //because of CascadeType.ALL
            System.out.printf("Saving instructor: " + tempInstructor);
            session.save(tempInstructor);


            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
