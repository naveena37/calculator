package nz.co.mywave.calculator.factory;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;
import nz.co.mywave.calculator.model.OperationType;
import nz.co.mywave.calculator.service.Operation;
import nz.co.mywave.calculator.validator.InputValidator;

import java.util.List;


public class OperationFactory {
    private final List<Operation> operations;
    private final InputValidator validator;

    public OperationFactory(final List<Operation> operations, final InputValidator validator) {
        this.operations = operations;
        this.validator = validator;
    }

    public Operation getOperation(String operator) {
        validator.validate(operator);

        OperationType inputOperation = OperationType.getOperationType(operator);
        return operations.stream()
                .filter(op -> op.getOperationType().equals(inputOperation))
                .findAny()
                .orElseThrow(() -> new UnsupportedOperatorException("Unsupported operator passed"));
    }
}
