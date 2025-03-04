import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user to enter first number
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble(); // read first number
        
        // prompt user to enter second number
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble(); // read second number
        
        // prompt user to enter operator
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next(); // read operator as string
        
        scanner.close(); // close scanner to avoid resource leak

        double result; // variable to store the result

        // use switch statement to perform calculation based on operator
        switch (op) {
            case "+": // if operator is addition
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-": // if operator is subtraction
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*": // if operator is multiplication
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/": // if operator is division
                if (second != 0) { // check if denominator is not zero
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default: // if operator is not valid
                System.out.println("Invalid Operator! Please enter +, -, * or /.");
        }
    }
}
