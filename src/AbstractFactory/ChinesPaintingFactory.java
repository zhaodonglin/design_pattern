package AbstractFactory;

import Facade.Parser;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class ChinesPaintingFactory implements PaintingFactory {
    @Override
    public Brush createBrush() {
        return new ChineseBrush();
    }

    @Override
    public Panel createPanel() {
        return new Paper();
    }
}
