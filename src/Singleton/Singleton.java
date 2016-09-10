package Singleton;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton11 = Singleton.getInstance();
        assert(singleton.equals(singleton11));
    }
}
