package Bridge;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class TestBridge {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Circle circle = new Circle(canvas);
        circle.draw();

        Paper paper = new Paper();
        Circle circle2 = new Circle(paper);
        circle2.draw();
    }
}
