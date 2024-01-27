package nz.co.mywave.calculator.service;


import nz.co.mywave.calculator.model.OperationType;
import nz.co.mywave.calculator.validator.OperandValidator;

import java.util.ArrayList;
import java.util.List;

public interface Operation {

    OperandValidator validator = new OperandValidator();

    Double operate(String operands);

    OperationType getOperationType();

    default List<Double> parseOperands(String operandsList) {
        String[] operandStrings = operandsList.split("\\s+");
        List<Double> operands = new ArrayList<>();
        for (String operand : operandStrings) {
            validator.validate(operand);
            operands.add(Double.parseDouble(operand));
        }

        return operands;
    }
}
