package shopping;

import shopping.nonefsm.Ticket;

public class Buy {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(0);
        ticket.printTicket();

        ticket.addToCart(0);
        ticket.addToCart(0);

        ticket.addToCart(1);
    }
}
