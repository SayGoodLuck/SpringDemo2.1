package webapp.spring.demo21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private String name;

    private List<String> classicalList = new ArrayList();

    public ClassicalMusic() {
        classicalList.add("The Carnival of the Animals");
        classicalList.add("Suite Bergamasque");
        classicalList.add("River Flows in You");
    }

    public String getName(){
        return name;
    }

    @Override
    public List<String> getSong() {
        return classicalList;
    }


}
