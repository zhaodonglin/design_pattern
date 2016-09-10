package Builder;

/**
 * Created by 10098565 on 2016/9/10.
 */
public class TestBuilder {
    public static void client() {

        ChineseSetMealBuilder builder = new ChineseSetMealBuilder();
        Cook cook = new Cook();

        cook.construct(builder);
        Food food = builder.getFood();
        food.show();
    }
    public static void main(String[] args) {
        client();
    }
}
