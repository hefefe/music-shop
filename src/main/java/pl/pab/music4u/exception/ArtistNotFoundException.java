package pl.pab.music4u.exception;

public class ArtistNotFoundException extends RuntimeException {
    public ArtistNotFoundException() {
        super("Artist not found");
    }
}
