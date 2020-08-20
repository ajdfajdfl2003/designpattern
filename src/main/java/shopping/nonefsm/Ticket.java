package shopping.nonefsm;

public class Ticket {
    private static final String openState = "open";
    private static final String inCartState = "inCart";

    private int seatId;
    private int userId;
    private String state;

    public Ticket(int seatId) {
        this.seatId = seatId;
        this.state = openState;
    }

    public void printTicket() {
        System.out.println("This ticket's seat id is " + this.seatId);
    }

    public boolean addToCart(int userId) {
        if (Ticket.openState.equals(this.state)) {
            this.state = Ticket.inCartState;
            this.userId = userId;
            return true;
        } else if (Ticket.inCartState.equals(this.state)) {
            if (this.userId == userId) {
                System.out.println("You have already added this ticket to your cart.");
                return true;
            } else {
                System.out.println("This ticket has been added by someone.");
                return false;
            }
        }
        return false;
    }
}
