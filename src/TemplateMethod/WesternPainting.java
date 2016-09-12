package TemplateMethod;

/**
 * Created by 10098565 on 2016/9/12.
 */
public class WesternPainting extends Painting {
    @Override
    void getBrush() {
        System.out.println("get a brush");
    }

    @Override
    void getPanel() {
        System.out.println("get canvas ");
    }
}
