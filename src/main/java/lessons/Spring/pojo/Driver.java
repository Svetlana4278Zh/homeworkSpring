package lessons.Spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    private String name;
    @Autowired
    private Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
