package shopping.fsm;

public class Ticket {
    private int seatId;
    private State state;
    private int userId;

    public Ticket(int seatId) {
        this.seatId = seatId;
        this.state = new OpenState(this);
    }

    public void nextState(State state) {
        this.state = state;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void printTicket() {
        System.out.println("This ticket's seat id is " + this.seatId);
    }

    public boolean addToCart(int userId) {
        return this.state.addToCart(userId);
    }
}
