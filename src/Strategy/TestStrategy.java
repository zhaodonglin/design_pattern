package Strategy;

/**
 * Created by 10098565 on 2016/9/12.
 */
public class TestStrategy {
    public static void main(String[] args) {
        Strategy strategy = new CircleStrategy();
        Shape shape = new Shape(strategy);
        shape.draw();
        shape.setDrawStrategy(new RectangleStrategy());
        shape.draw();
    }
}
