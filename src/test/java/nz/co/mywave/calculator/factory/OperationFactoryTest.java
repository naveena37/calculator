package nz.co.mywave.calculator.factory;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;
import nz.co.mywave.calculator.service.Addition;
import nz.co.mywave.calculator.service.Division;
import nz.co.mywave.calculator.service.Multiplication;
import nz.co.mywave.calculator.service.Operation;
import nz.co.mywave.calculator.service.Subtraction;
import nz.co.mywave.calculator.validator.OperatorValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OperationFactoryTest {

    OperationFactory factory;

    @BeforeEach
    void setUp() {
        List<Operation> operations = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());
        factory = new OperationFactory(operations, new OperatorValidator());
    }

    @Test
    void getAdditionOperation() {
        assertTrue(factory.getOperation("+") instanceof Addition);
    }

    @Test
    void getSubtractionOperation() {
        assertTrue(factory.getOperation("-") instanceof Subtraction);
    }

    @Test
    void getMultiplicationOperation() {
        assertTrue(factory.getOperation("*") instanceof Multiplication);
    }

    @Test
    void getDivisionOperation() {
        assertTrue(factory.getOperation("/") instanceof Division);
    }

    @Test
    void throwUnsupportedOperatorException() {
        UnsupportedOperatorException thrown = assertThrows(
                UnsupportedOperatorException.class,
                () -> factory.getOperation("%"),
                "Exception must be thrown when an unsupported operator is passed"
        );

        assertTrue(thrown.getMessage().contains("Operator % is not supported"));
    }
}