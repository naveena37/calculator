package nz.co.mywave.calculator.validator;


import nz.co.mywave.calculator.exception.UnsupportedOperandException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperandValidatorTest {
    OperandValidator validator = new OperandValidator();

    @Test
    void validateDoubleOperand() {
        assertDoesNotThrow(
                () -> validator.validate("6.787"),
                "No exception must be thrown for a double operand"
        );
    }

    @Test
    void validateNonDoubleOperand() {
        UnsupportedOperandException thrown = assertThrows(
                UnsupportedOperandException.class,
                () -> validator.validate("xyz"),
                "Exception must be thrown when a non-double operand is validated"
        );

        assertTrue(thrown.getMessage().contains("xyz is not a double operand"));
    }
}