package Decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class SuperMarketTicket implements Ticket{
    private Map<String,Integer> items;
    public SuperMarketTicket() {
        items = new HashMap<>();
    }

    public void AddItem(String item,  Integer price) {
        items.put(item, price);
    }
    @Override
    public void Print() {
        for (Map.Entry<String, Integer> item : items.entrySet()) {
            System.out.println("item:"+item.getKey()+" value:"+item.getValue());
        }
    }
}
