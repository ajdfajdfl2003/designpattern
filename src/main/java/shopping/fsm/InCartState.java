package shopping.fsm;

public class InCartState implements State {
    private final Ticket context;

    public InCartState(Ticket ticket) {
        this.context = ticket;
    }

    public boolean addToCart(int userId) {
        if (this.context.getUserId() == userId) {
            System.out.println("You have already added this ticket to your cart.");
            return true;
        } else {
            System.out.println("This ticket has been added by someone.");
            return false;
        }
    }
}
