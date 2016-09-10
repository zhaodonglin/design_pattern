package AbstractFactory;

/**
 * Created by 10098565 on 2016/9/10.
 */
public interface PaintingFactory {
    Brush createBrush();
    Panel createPanel();
}
