package nz.co.mywave.calculator.validator;

import nz.co.mywave.calculator.exception.UnsupportedOperatorException;

import java.util.Arrays;
import java.util.List;

public class OperatorValidator implements InputValidator {

    private static final List<String> SUPPORTED_OPERATORS = Arrays.asList("+", "-", "*", "/");

    @Override
    public void validate(String operator) {
        if (!SUPPORTED_OPERATORS.contains(operator)) {
            throw new UnsupportedOperatorException(String.format("Operator %s is not supported", operator));
        }
    }
}
