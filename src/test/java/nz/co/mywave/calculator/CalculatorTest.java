package nz.co.mywave.calculator;

import nz.co.mywave.Calculator;
import nz.co.mywave.calculator.exception.UnsupportedOperandException;
import nz.co.mywave.calculator.exception.UnsupportedOperatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void canPerformAddition() {
        assertEquals(2.3 + 4.7, calculator.calculate("+", "2.3 4.7"));
    }

    @Test
    void canPerformSubtraction() {
        assertEquals(5.9 - 5.3, calculator.calculate("-", "5.9 5.3"));
    }

    @Test
    void canPerformMultiplication() {
        assertEquals(8.2 * 10.0, calculator.calculate("*", "8.2 10.0"));
    }

    @Test
    void canPerformDivision() {
        assertEquals(22.2 / 2.0, calculator.calculate("/", "22.2 2.0"));
    }

    @Test
    void expectUnsupportedOperatorExceptionWhenOperatorIsUnknown() {
        UnsupportedOperatorException thrown = assertThrows(
                UnsupportedOperatorException.class,
                () -> calculator.calculate("$", "6 8.9"),
                "Exception must be thrown when an unsupported operator is passed"
        );

        assertTrue(thrown.getMessage().contains("Operator $ is not supported"));
    }

    @Test
    void expectUnsupportedOperandExceptionWhenOperandsAreNotDouble() {
        UnsupportedOperandException thrown = assertThrows(
                UnsupportedOperandException.class,
                () -> calculator.calculate("+", "6 xyz"),
                "Exception must be thrown when a non-double operand is validated"
        );

        assertTrue(thrown.getMessage().contains("xyz is not a double operand"));
    }
}