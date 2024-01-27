package nz.co.mywave.calculator.model;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;

import java.util.Arrays;

public enum OperationType {
    ADDITION("+"), SUBTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");

    private final String operator;

    OperationType(String operator) {
        this.operator = operator;
    }

    public static OperationType getOperationType(String inputOperator) {
        return Arrays.stream(OperationType.values())
                .filter(op -> op.getOperator().equals(inputOperator))
                .findAny()
                .orElseThrow(() -> new UnsupportedOperatorException(String.format("Operator %s is not supported", inputOperator)));
    }

    public String getOperator() {
        return operator;
    }
}
