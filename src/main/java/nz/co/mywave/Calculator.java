package nz.co.mywave;


import nz.co.mywave.calculator.factory.OperationFactory;
import nz.co.mywave.calculator.service.*;
import nz.co.mywave.calculator.validator.OperatorValidator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one of the following operations: +, -, *, / : ");
        String operation = scanner.nextLine();

        System.out.print("Enter the operands separated by space e.g., 2.5 3 8.8 : ");
        String operands = scanner.nextLine();

        Double result = calculator.calculate(operation, operands);
        System.out.println("The result is: " + result);
    }

    public Double calculate(String operation, String operands) {

        List<Operation> operations = Arrays.asList(new Addition(), new Subtraction(), new Multiplication(), new Division());
        OperationFactory factory = new OperationFactory(operations, new OperatorValidator());
        Operation operator = factory.getOperation(operation);

        return operator.operate(operands);
    }

}
