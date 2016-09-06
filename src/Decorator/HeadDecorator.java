package Decorator;

/**
 * Created by 10098565 on 2016/9/6.
 */
public class HeadDecorator implements Ticket {
    private Ticket ticket;

    public HeadDecorator(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void Print() {
        System.out.println("**********************");
        ticket.Print();
    }
}
