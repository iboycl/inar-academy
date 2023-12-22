package main.test;

import main.java.OrderStatusManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStatusManagerTest {
    @Test
    public void TC_01_TestNextStateTransitionFromNew() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.PENDING, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : After New state it should transfer to Pending");
    }

    @Test
    public void TC_02_TestNextStateTransitionFromPending() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : After Pending state it should transfer to Shipped");
    }

    @Test
    public void TC_03_TestNextStateTransitionFromShipped() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : After Shipped state it should transfer to Delivered");
    }

    @Test
    public void TC_04_TestNextStateTransitionFromDelivered() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : After Delivered state it should not transfer to any state");
    }

    @Test
    public void TC_05_TestNextStateTransitionFromCancelled() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        manager.nextState();
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : After Cancelled state it should not transfer to any state");
    }

    @Test
    public void TC_06_TestCancelOrderFromNew() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.NEW);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : At New state it can be transferred to Cancelled state");
    }

    @Test
    public void TC_07_TestCancelOrderFromPending() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.PENDING);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : At Pending state it can be transferred to Cancelled state");
    }

    @Test
    public void TC_08_TestCancelOrderFromShipped() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.SHIPPED);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.SHIPPED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : At Shipped state it can not be transferred to Cancelled state");
    }

    @Test
    public void TC_09_TestCancelOrderFromSDelivered() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.DELIVERED);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.DELIVERED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : At Delivered state it can not be transferred to Cancelled state");
    }

    @Test
    public void TC_10_TestCancelOrderFromSCancelled() {
        OrderStatusManager manager = new OrderStatusManager(OrderStatusManager.OrderState.CANCELLED);
        manager.cancelOrder();
        assertEquals(OrderStatusManager.OrderState.CANCELLED, manager.getCurrentState(),
                "\n           --> Testing Order Status Manager" +
                        "\n Rule        : At Cancelled state it can not be transferred to Cancelled state");
    }
}
