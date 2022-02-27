package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // Carregar configuracio Spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Obtenir el bean del contenidor
        Coach bCoach = context.getBean("myBasketCoach", Coach.class);
        Coach gCoach = context.getBean("myGymCoach", Coach.class);
        Coach sCoach = context.getBean("mySkateCoach", Coach.class);

        // Cridar els metodes al bean
        System.out.println(bCoach.getDailyPractice());

        System.out.println(bCoach.getLastGameStats());
        System.out.println(gCoach.getLastGameStats());
        System.out.println(sCoach.getLastGameStats());

        // Tanquem el contexte
        context.close();

    }
}
