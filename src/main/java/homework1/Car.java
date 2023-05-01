package homework1;

import javax.annotation.PostConstruct;

public class Car extends Transport{
    private String type;

    public Car(String type) {
        this.type = type;
    }

    public Car() {
    }
    @PostConstruct
    public void start(){
        System.out.println(type + " готов к работе");
    }
    @Override
    public String toString() {
        return type;
    }
}
