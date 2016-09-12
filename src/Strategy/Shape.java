package Strategy;

/**
 * Created by 10098565 on 2016/9/12.
 */
public class Shape {
    Strategy strategy;
    public Shape(Strategy strategy) {
        this.strategy = strategy;
    }
    public void setDrawStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void draw() {
        this.strategy.draw();
    }
}
