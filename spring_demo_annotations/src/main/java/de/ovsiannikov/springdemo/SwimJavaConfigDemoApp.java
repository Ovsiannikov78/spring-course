package de.ovsiannikov.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        /*// get the bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // call our new swim coach methods ... has the props values injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());*/

        KickboxingCoach theCoach = context.getBean("kickboxingCoach", KickboxingCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("email: " + theCoach.getEmail1());
        System.out.println("teamName: " + theCoach.getTeamName());

        // close the context
        context.close();
    }
}