package shopping.fsm;

public class OpenState implements State {
    private final Ticket context;

    public OpenState(Ticket ticket) {
        this.context = ticket;
    }

    public boolean addToCart(int userId) {
        this.context.nextState(new InCartState(this.context));
        this.context.setUserId(userId);
        return true;
    }
}
