package AbstractFactory;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class TestAbstractFactory {
    public static void client(PaintingFactory paintingFactory) {
        Brush brush = paintingFactory.createBrush();
        Panel panel = paintingFactory.createPanel();
        brush.show();
        panel.show();
    }
    public static void main(String[] args) {
        PaintingFactory chinesePaintingFactory = new ChinesPaintingFactory();
        client(chinesePaintingFactory);

        PaintingFactory westernPaintingFactory = new WesternPaintingFactory();
        client(westernPaintingFactory);
    }
}
