package ObjectAdapter;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class Adapter implements Shape{
    public Adapter(){
        triangle = new Triangle();
    }
    @Override
    public void draw() {
        triangle.Print();
    }
    private Triangle triangle;
}
