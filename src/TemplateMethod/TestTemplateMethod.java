package TemplateMethod;

import Builder.WesternSetMealBuilder;

/**
 * Created by 10098565 on 2016/9/12.
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        ChinesePainting chinesePainting = new ChinesePainting();
        chinesePainting.drawShape();
        WesternPainting westernPainting = new WesternPainting();
        westernPainting.drawShape();
    }
}
