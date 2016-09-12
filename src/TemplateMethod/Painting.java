package TemplateMethod;

/**
 * Created by 10098565 on 2016/9/12.
 */
public abstract class Painting {
    abstract void getBrush();
    abstract void getPanel();

    void drawShape() {
        getBrush();
        getPanel();
        System.out.println("This is a shape");
    }
}
