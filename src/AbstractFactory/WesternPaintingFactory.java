package AbstractFactory;

/**
 * Created by 10098565 on 2016/9/10.
 */
class WesternPaintingFactory implements PaintingFactory {
    @Override
    public Brush createBrush() {
        return new WesternBrush();
    }

    @Override
    public Panel createPanel() {
        return new Canvas();
    }
}
