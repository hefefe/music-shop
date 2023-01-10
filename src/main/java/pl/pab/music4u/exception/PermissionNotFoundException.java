package pl.pab.music4u.exception;

public class PermissionNotFoundException extends RuntimeException{
    public PermissionNotFoundException() {
        super("Permission not found");
    }
}
