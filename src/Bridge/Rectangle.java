package Bridge;

/**
 * Created by 10098565 on 2016/9/7.
 */
public class Rectangle extends Shape {

    public Rectangle(Medium mediumImpl) {
        super(mediumImpl);
    }

    @Override
    public void draw() {
        mediumImpl.show();
        System.out.println("Rectangle");
    }
}
