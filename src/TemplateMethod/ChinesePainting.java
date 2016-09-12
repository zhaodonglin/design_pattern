package TemplateMethod;

/**
 * Created by 10098565 on 2016/9/12.
 */
public class ChinesePainting extends Painting {

    @Override
    void getBrush() {
        System.out.println("Get a chines Brush");
    }

    @Override
    void getPanel() {
        System.out.println("Get a piece of paper");
    }
}
