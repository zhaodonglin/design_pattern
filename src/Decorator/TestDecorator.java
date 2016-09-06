package Decorator;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class TestDecorator {
    public static void main(String[] args) {
        SuperMarketTicket ticket = new SuperMarketTicket();
        ticket.AddItem("Fruit", 10);
        ticket.AddItem("Meat",20);
        HeadDecorator headDecorator = new HeadDecorator(ticket);
        TailDecorator tailDecorator = new TailDecorator(headDecorator);
        tailDecorator.Print();
    }
}
