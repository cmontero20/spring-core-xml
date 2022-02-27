package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // Carregar configuracio Spring
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Obtenir el bean del contenidor
        BasketballCoach bCoach = context.getBean("myBasketCoach", BasketballCoach.class);

        // Cridar els metodes al bean
        System.out.println(bCoach.getDailyPractice());

        System.out.println(bCoach.getEmailAddress());
        System.out.println(bCoach.getTeam());



        System.out.println("----------------------------");

        Coach sCoach = context.getBean("mySkateCoach", Coach.class);
        System.out.println(sCoach.getDailyPractice());

        // Tanquem el contexte
        context.close();

    }
}
