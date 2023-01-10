package pl.pab.music4u.exception;

public class AdressNotFoundException extends RuntimeException{
    public AdressNotFoundException() {
        super("Address not found");
    }
}
