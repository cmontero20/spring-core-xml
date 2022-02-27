package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        
        // Carregar fitxer de configuracio
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Obtenir el bean del contenidor
        Coach coach = context.getBean("myBasketCoach", Coach.class);

        System.out.println(coach.getDailyPractice());

        // Tanquem el contexte
        context.close();
    }
}
