package cat.ilg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Carregar fitxer de configuracio
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Obtenir el bean del contenidor
        Coach coach = context.getBean("myBasketCoach", Coach.class);
        Coach coach2 = context.getBean("myBasketCoach", Coach.class);

        // Comprobem si els beans son els mateixos
        boolean result = (coach == coach2);

        // Imprimim els resultats
        System.out.println("\nPointing to the same object? " + result);

        System.out.println("\nMemory location for coach is: " + coach.toString());
        System.out.println("\nMemory location for coach2 is: " + coach2.toString());

        // Tanquem el contexte
        context.close();
    }
}
