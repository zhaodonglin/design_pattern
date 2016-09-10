package Builder;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class Cook {
    public void construct(SetMealBuilder builder) {
        builder.addStapleFood();
        builder.addBeverage();
        builder.addTools();
    }
}
