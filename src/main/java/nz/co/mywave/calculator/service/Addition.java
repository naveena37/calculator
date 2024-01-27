package nz.co.mywave.calculator.service;


import nz.co.mywave.calculator.model.OperationType;

import java.util.List;

public class Addition implements Operation {
    @Override
    public Double operate(String operandsList) {
        List<Double> operands = parseOperands(operandsList);
        return operands.stream().reduce((left, right) -> left + right).get();
    }

    @Override
    public OperationType getOperationType() {
        return OperationType.ADDITION;
    }
}
