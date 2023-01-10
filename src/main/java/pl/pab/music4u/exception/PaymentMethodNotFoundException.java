package pl.pab.music4u.exception;

public class PaymentMethodNotFoundException extends RuntimeException{
    public PaymentMethodNotFoundException() {
        super("Payment method not found");
    }
}
