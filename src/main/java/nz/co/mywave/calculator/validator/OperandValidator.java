package nz.co.mywave.calculator.validator;

import nz.co.mywave.calculator.exception.UnsupportedOperandException;

public class OperandValidator implements InputValidator {

    private static final String DOUBLE_PATTERN = "-?\\d+[.]?\\d*";    //Pattern also supports negative numbers

    @Override
    public void validate(String operand) {
        if (!operand.matches(DOUBLE_PATTERN)) {
            throw new UnsupportedOperandException(String.format("%s is not a double operand", operand));
        }

    }
}
