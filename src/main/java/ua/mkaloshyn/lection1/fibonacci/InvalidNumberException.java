package ua.mkaloshyn.lection1.fibonacci;

public class InvalidNumberException extends RuntimeException {

    String message;

    public InvalidNumberException(){

    }

    public InvalidNumberException(String message){
        super(message);
    }
}
