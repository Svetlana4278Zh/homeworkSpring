package homework1.config;

import homework1.Bus;
import homework1.Car;
import homework1.Driver;
import homework1.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("car")
    public Car getCarBean(){
        return new Car("Легковой автомобиль");
    }

    @Bean("bus")
    public Bus getBusBean(){
        return new Bus("Автобус");
    }

    @Bean("pickup")
    public Pickup getPickupBean(){
        return new Pickup("Пикап");
    }
    @Bean("driver1")
    public Driver getDriver1Bean(){
        return new Driver("Иван", getCarBean());
    }
    @Bean("driver2")
    public Driver getDriver2Bean(){
        return new Driver("Олег", getBusBean());
    }
    @Bean("driver3")
    public Driver getDriver3Bean(){
        return new Driver("Максим", getPickupBean());
    }
}
