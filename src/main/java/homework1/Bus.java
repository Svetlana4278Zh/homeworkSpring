package homework1;

import javax.annotation.PostConstruct;

public class Bus extends Transport{
    private String type;

    public Bus(String type) {
        this.type = type;
    }

    public Bus() {
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
