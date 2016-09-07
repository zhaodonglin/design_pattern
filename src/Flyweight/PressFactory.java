package Flyweight;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class PressFactory {
    private static List<Press> pressList = new LinkedList<>();

    private PressFactory() {

    }

    public static Press getPress(String pressName) {

        for (Press s:pressList) {
            if (s.isSamePress(pressName)) {
                return s;
            }
        }
        Press press =  new Press(pressName);
        pressList.add(press);
        return press;
    }

    public static void getPressNum(){
        System.out.println(pressList.size());
        return;
    }
}
