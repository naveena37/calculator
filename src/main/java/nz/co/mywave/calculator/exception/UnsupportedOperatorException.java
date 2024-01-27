package nz.co.mywave.calculator.exception;

public class UnsupportedOperatorException extends RuntimeException {
    public UnsupportedOperatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedOperatorException(String message) {
        super(message);
    }
}
