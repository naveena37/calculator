package nz.co.mywave.calculator.model;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;
import org.junit.jupiter.api.Test;

import static nz.co.mywave.calculator.model.OperationType.ADDITION;
import static nz.co.mywave.calculator.model.OperationType.DIVISION;
import static nz.co.mywave.calculator.model.OperationType.MULTIPLICATION;
import static nz.co.mywave.calculator.model.OperationType.SUBTRACTION;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperationTypeTest {

    @Test
    void checkAdditionOperator() {
        assertEquals("+", ADDITION.getOperator());
    }

    @Test
    void checkSubtractionOperator() {
        assertEquals("-", SUBTRACTION.getOperator());
    }

    @Test
    void checkMultiplicationOperator() {
        assertEquals("*", MULTIPLICATION.getOperator());
    }

    @Test
    void checkDivisionOperator() {
        assertEquals("/", DIVISION.getOperator());
    }

    @Test
    void checkAdditionOperationType() {
        assertEquals(ADDITION, OperationType.getOperationType("+"));
    }

    @Test
    void checkSubtractionOperationType() {
        assertEquals(SUBTRACTION, OperationType.getOperationType("-"));
    }

    @Test
    void checkMultiplicationOperationType() {
        assertEquals(MULTIPLICATION, OperationType.getOperationType("*"));
    }

    @Test
    void checkDivisionOperationType() {
        assertEquals(DIVISION, OperationType.getOperationType("/"));
    }

    @Test
    void throwUnsupportedOperatorException() {
        UnsupportedOperatorException thrown = assertThrows(
                UnsupportedOperatorException.class,
                () -> OperationType.getOperationType("?"),
                "Exception must be thrown when an unsupported operator is passed"
        );

        assertTrue(thrown.getMessage().contains("Operator ? is not supported"));
    }
}