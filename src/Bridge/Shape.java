package Bridge;

/**
 * Created by 10098565 on 2016/9/7.
 */
public abstract class Shape {
    Medium mediumImpl;
    public abstract void draw();
    public Shape(Medium mediumImpl) {
        this.mediumImpl = mediumImpl;
    }
}
