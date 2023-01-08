package pl.pab.music4u.exception;

public class GenreNotFoundException extends RuntimeException{

    public GenreNotFoundException(){
        super("Genre not found");
    }
}
