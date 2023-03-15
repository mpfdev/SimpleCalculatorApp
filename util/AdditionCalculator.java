package util;

import Interface.IOperator;

public class AdditionCalculator implements IOperator {

    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
