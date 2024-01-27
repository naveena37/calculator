package nz.co.mywave.calculator.service;

import org.junit.jupiter.api.Test;

import static nz.co.mywave.calculator.model.OperationType.SUBTRACTION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    Subtraction subtraction = new Subtraction();

    @Test
    void testSubtraction() {
        assertEquals(9.3, subtraction.operate("11.8 2.5"));
    }

    @Test
    void testOperationType() {
        assertEquals(SUBTRACTION, subtraction.getOperationType());
    }
}
