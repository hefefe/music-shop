package pl.pab.music4u.exception;

public class WarehouseStateNotFoundException extends RuntimeException{
    public WarehouseStateNotFoundException() {
        super("Warehouse state not found");
    }
}
