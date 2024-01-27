package nz.co.mywave.calculator.service;

import org.junit.jupiter.api.Test;

import static nz.co.mywave.calculator.model.OperationType.MULTIPLICATION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {
    Multiplication multiplication = new Multiplication();

    @Test
    void testMultiplication() {
        assertEquals(25, multiplication.operate("10.0 2.5"));
    }

    @Test
    void testMultiplicationWithMultipleOperands() {
        assertEquals(48, multiplication.operate("2.0 2.4 10.0"));
    }

    @Test
    void testOperationType() {
        assertEquals(MULTIPLICATION, multiplication.getOperationType());
    }
}
