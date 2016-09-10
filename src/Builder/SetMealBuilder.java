package Builder;

/**
 * Created by 10098565 on 2016/9/10.
 */
public interface SetMealBuilder {
    void addStapleFood();
    void addBeverage();
    void addTools();
    Food getFood();
}
