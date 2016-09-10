package Builder;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class WesternSetMealBuilder implements SetMealBuilder {
    private Food food;
    WesternSetMealBuilder() {
        food = new Food();
    }
    @Override
    public void addStapleFood( ) {
        food.add("Beef");
    }

    @Override
    public void addBeverage( ) {
        food.add("Coca cola");
    }

    @Override
    public void addTools( ) {
        food.add("Fork and Knife");
    }

    @Override
    public Food getFood() {
        return food;
    }

}
