package Proxy;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class ProxyCircle implements Shape {
    private Circle circle;
    private int count = 0;
    public ProxyCircle() {
        circle = new Circle();
        count = 0;
    }

    @Override
    public void draw() {
        circle.draw();
        count++;
        System.out.println("count"+count);

    }
}
