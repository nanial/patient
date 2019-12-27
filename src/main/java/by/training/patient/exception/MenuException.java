package by.training.patient.exception;

public class MenuException extends Exception {

    private static final long serialVersionUID = 1L;

    public MenuException() {
        super();
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(Exception e) {
        super(e);
    }

    public MenuException(String message, Exception e) {
        super(message, e);
    }
}
