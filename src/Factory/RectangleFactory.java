package Factory;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createInstance() {
        return new Rectangle();
    }
}
