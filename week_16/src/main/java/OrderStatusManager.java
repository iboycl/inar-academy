package main.java;

public class OrderStatusManager {


    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }

    private OrderState currentState;
    /**
     * Transitions the order to the next state based on the current state.
     *
     * @return The next state of the order.
     */

    public OrderStatusManager(OrderState initialState) {
        currentState = initialState;
    }

    public void nextState() {
        switch (currentState) {
            case NEW -> currentState = OrderState.PENDING;
            case PENDING -> currentState = OrderState.SHIPPED;
            case SHIPPED -> currentState = OrderState.DELIVERED;
        }
    }
    public OrderState getCurrentState() {
        return currentState;
    }
    /**
     * Cancels the order if it is in a state that allows for cancellation.
     */
    public void cancelOrder() {
// Orders can only be cancelled if they are NEW or PENDING.
        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            currentState = OrderState.CANCELLED;
        }
    }
}
