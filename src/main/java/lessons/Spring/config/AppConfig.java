package lessons.Spring.config;

import lessons.Spring.pojo.Car;
import lessons.Spring.pojo.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope (scopeName = "prototype")
    public Car getCarBean(){
        return new Car ("BMW");
    }

    @Bean ("driver1")
    public Driver getDriver1Bean(){
        return new Driver ("Ivan");
    }
    @Bean ("driver2")
    public Driver getDriver2Bean(){
        return new Driver ("Denis");
    }
}
