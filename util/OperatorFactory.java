package util;

import ErrorHandling.ParseException;
import Interface.IOperator;

public class OperatorFactory {

    public static IOperator getSymbol(String symbol) throws ParseException {
        switch (symbol) {
            case "+":
                return new AdditionCalculator();
            case "-":
                return new SubtractionCalculator();
            case "*":
                return new MultiplicationCalculator();
            case "/":
                return new DivisionCalculator();
            default:
                throw new ParseException("Invalid: " + symbol);
        }
    }
}
