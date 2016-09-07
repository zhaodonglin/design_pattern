package Flyweight;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class Book {
    Press press;
    String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public void setPress(String pressName) {
        this.press = PressFactory.getPress(pressName);
    }
}
