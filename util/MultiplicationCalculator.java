package util;

import Interface.IOperator;

public class MultiplicationCalculator implements IOperator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}
