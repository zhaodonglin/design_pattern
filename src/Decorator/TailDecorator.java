package Decorator;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class TailDecorator implements Ticket {
    private Ticket ticket;

    public TailDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void Print() {
        ticket.Print();
        System.out.println("------------------------");
    }
}
