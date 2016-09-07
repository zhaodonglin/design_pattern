package Flyweight;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class Press {
    String pressName;

    public Press(String pressName) {
        this.pressName = pressName;
    }
    public boolean isSamePress(String name) {
        return name.equals(this.pressName);
    }
}
