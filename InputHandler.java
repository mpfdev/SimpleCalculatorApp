import ErrorHandling.ParseException;
import Interface.IOperator;
import util.OperatorFactory;

import java.util.Scanner;

public class InputHandler {
    private static final String EXIT_COMMAND = "exit";

    private Scanner sc;

    public InputHandler() {
        sc = new Scanner(System.in);
    }

    public void execute() {
        System.out.println("Welcomer to the Simple Calculator App");
        System.out.println("Enter the expression: number operand number");
        System.out.println("To quit: enter EXIT");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase(EXIT_COMMAND)) {
                break;
            }

            try {
                double result = evaluateExpression(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                throw new RuntimeException("Error" + e.getMessage());
            }
        }

        sc.close();
        System.out.println("Thanks for using the calculator app");
    }

    private double evaluateExpression(String input) throws ParseException{
        String[] tokens = Token.tokens(input);
        if (tokens.length != 3) {
            throw new ParseException("Invalid expression: " + tokens);
        }

        double num1 = Double.parseDouble(tokens[0]);
        String operatorSymbol = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        IOperator operator = OperatorFactory.getSymbol(operatorSymbol);

        return operator.calculate(num1, num2);

    }
}
