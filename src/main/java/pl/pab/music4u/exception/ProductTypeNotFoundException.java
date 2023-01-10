package pl.pab.music4u.exception;

public class ProductTypeNotFoundException extends RuntimeException{
    public ProductTypeNotFoundException() {
        super("Product type not found");
    }
}
