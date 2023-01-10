package pl.pab.music4u.exception;

public class DiscountCodesNotFound extends RuntimeException{
    public DiscountCodesNotFound() {
        super("Discount code not found");
    }
}
