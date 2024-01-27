package nz.co.mywave.calculator.service;

import org.junit.jupiter.api.Test;

import static nz.co.mywave.calculator.model.OperationType.ADDITION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    Addition addition = new Addition();

    @Test
    void testAdditionWithTwoOperands() {
        assertEquals(4, addition.operate("1.6 2.4"));
    }

    @Test
    void testAdditionWithMultipleOperands() {
        assertEquals(23, addition.operate("1.6 2.4 8.1 10.9"));
    }

    @Test
    void testOperationType() {
        assertEquals(ADDITION, addition.getOperationType());
    }
}
