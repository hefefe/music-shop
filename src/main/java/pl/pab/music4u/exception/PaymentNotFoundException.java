package pl.pab.music4u.exception;

public class PaymentNotFoundException extends RuntimeException{
    public PaymentNotFoundException() {
        super("Payment not found");
    }
}
