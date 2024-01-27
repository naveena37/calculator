package nz.co.mywave.calculator.validator;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class OperatorValidatorTest {
    OperatorValidator validator = new OperatorValidator();

    @Test
    void validateSupportedOperator() {
        assertDoesNotThrow(
                () -> validator.validate("*"),
                "No exception must be thrown for a supported operator"
        );
    }

    @Test
    void validateUnsupportedOperator() {
        UnsupportedOperatorException thrown = assertThrows(
                UnsupportedOperatorException.class,
                () -> validator.validate("%"),
                "Exception must be thrown when an unsupported operator is validated"
        );

        assertTrue(thrown.getMessage().contains("Operator % is not supported"));
    }
}