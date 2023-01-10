package pl.pab.music4u.exception;

public class OrderElementsNotFoundException extends RuntimeException{
    public OrderElementsNotFoundException() {
        super("Order elements not found");
    }
}
