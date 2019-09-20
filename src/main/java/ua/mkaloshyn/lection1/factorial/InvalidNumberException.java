package ua.mkaloshyn.lection1.factorial;

public class InvalidNumberException extends Exception {

    private String message;

    public InvalidNumberException(String message) {
        this.message = message;
    }

    public InvalidNumberException() {

    }
}
