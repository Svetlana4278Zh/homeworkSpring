package lessons.Spring;

import lessons.Spring.config.AppConfig;
import lessons.Spring.pojo.Car;
import lessons.Spring.pojo.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        System.out.println(car);

        Driver driver1 = context.getBean("driver1", Driver.class);
        Driver driver2 = context.getBean("driver2", Driver.class);
        System.out.println(driver1.getCar() == driver2.getCar());
    }
}
