package nz.co.mywave.calculator.exception;

public class UnsupportedOperandException extends RuntimeException {
    public UnsupportedOperandException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedOperandException(String message) {
        super(message);
    }
}
