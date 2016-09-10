package Builder;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class ChineseSetMealBuilder implements SetMealBuilder {
    Food food;

    public ChineseSetMealBuilder() {
        this.food = new Food();
    }

    @Override
    public void addStapleFood() {
        food.add("Rice");
    }

    @Override
    public void addBeverage() {
        food.add("Soybean");
    }

    @Override
    public void addTools( ) {
        food.add("Chopsticks");
    }

    @Override
    public Food getFood() {
        return food;
    }
}
