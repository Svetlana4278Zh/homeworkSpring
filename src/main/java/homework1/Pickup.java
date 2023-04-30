package homework1;

import javax.annotation.PostConstruct;

public class Pickup extends Transport{
    private String type;

    public Pickup(String type) {
        this.type = type;
    }

    public Pickup() {
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
