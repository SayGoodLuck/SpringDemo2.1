package webapp.spring.demo21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private String name;

    public List<String> rockList = new ArrayList<>();

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }

    public RockMusic() {
        rockList.add("Wind of Change");
        rockList.add("Eye of the Tiger");
        rockList.add("Misirlou");
    }

    public String getName() {
        return name;
    }

    @Override
    public List<String> getSong(){
        return rockList;
    }
}
