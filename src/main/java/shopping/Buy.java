package shopping;

import shopping.nonefsm.Ticket;

public class Buy {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(0);
        ticket.printTicket();

        ticket.addToCart(0);
        ticket.addToCart(0);

        ticket.addToCart(1);
        System.out.println("======divider=====");
        shopping.fsm.Ticket ticketA = new shopping.fsm.Ticket(0);
        ticketA.printTicket();

        ticketA.addToCart(0);
        ticketA.addToCart(0);

        ticketA.addToCart(1);
    }
}
