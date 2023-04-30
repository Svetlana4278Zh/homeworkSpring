package homework1;

import homework1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("driver1", Driver.class));
        System.out.println(context.getBean("driver2", Driver.class));
        System.out.println(context.getBean("driver3", Driver.class));
    }
}
