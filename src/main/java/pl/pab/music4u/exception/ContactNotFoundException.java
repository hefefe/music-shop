package pl.pab.music4u.exception;

public class ContactNotFoundException extends RuntimeException{
    public ContactNotFoundException() {
        super("Contact not found");
    }
}
