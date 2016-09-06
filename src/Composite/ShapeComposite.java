package Composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class ShapeComposite implements Shape {
    List<Shape> shapes;

    public ShapeComposite() {
        shapes  = new LinkedList<>();
    }

    public void AddShape(Shape s) {
        shapes.add(s);
    }

    @Override
    public void draw() {
        for (Shape s:shapes) {
            s.draw();
        }
    }
}
