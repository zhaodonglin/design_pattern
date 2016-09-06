package Composite;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class TestShapeComposite {
    public static void main(String[] args) {
        ShapeComposite shape = new ShapeComposite();
        shape.AddShape(new Circle());
        shape.AddShape(new Rectangle());
        ShapeComposite pic = new ShapeComposite();
        pic.AddShape(shape);
        pic.AddShape(new Circle());
        pic.draw();

    }
}
