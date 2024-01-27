package nz.co.mywave.calculator.service;

import org.junit.jupiter.api.Test;

import static nz.co.mywave.calculator.model.OperationType.DIVISION;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    Division division = new Division();

    @Test
    void testDivision() {
        assertEquals(5.3, division.operate("10.6 2.0"));
    }

    @Test
    void testDivisionByZeroAndExpectPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, division.operate("22.2 0.0"));
    }

    @Test
    void testDivisionByZeroAndExpectNegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, division.operate("-22.2 0.0"));
    }

    @Test
    void testDivisionOfZeroByZeroAndExpectNaN() {
        assertEquals(Double.NaN, division.operate("0.0 0.0"));
    }

    @Test
    void testOperationType() {
        assertEquals(DIVISION, division.getOperationType());
    }
}
