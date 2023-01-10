package pl.pab.music4u.exception;

public class WarehouseNotFoundException extends RuntimeException{
    public WarehouseNotFoundException() {
        super("Warehouse not found");
    }
}
