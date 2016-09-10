package Builder;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class Food {
    List<String> parts;
    Food() {
        parts = new LinkedList<>();
    }
    public void add(String name){
        parts.add(name);
    }

    public void show() {
        for (String s: parts) {
            System.out.println(s);
        }
    }
}
