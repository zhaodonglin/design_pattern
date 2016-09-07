package Flyweight;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class TestFlyWeight {
    public static void main(String[] args) {
        Book book1 = new Book("C++");
        book1.setPress("Prentice Hall");
        Book book2 = new Book("JAVA");
        book2.setPress("Prentice Hall");
        PressFactory.getPressNum();
    }
}
