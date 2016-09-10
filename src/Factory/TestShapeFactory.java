package Factory;

import org.w3c.dom.css.Rect;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class TestShapeFactory  {
    public static void client(ShapeFactory shapeFactory) {
        Shape s = shapeFactory.createInstance();
        s.draw();
    }
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        client(circleFactory);
        RectangleFactory rectangleFactory = new RectangleFactory();
        client(rectangleFactory);

    }
}
