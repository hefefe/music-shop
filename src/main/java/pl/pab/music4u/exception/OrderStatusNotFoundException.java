package pl.pab.music4u.exception;

public class OrderStatusNotFoundException extends RuntimeException{
    public OrderStatusNotFoundException() {
        super("Order status not found");
    }
}
