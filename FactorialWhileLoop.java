import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a positive integer: "); // ask user for input
        int n = scanner.nextInt(); // read user input
        
        if (n < 0) { // check if input is a positive integer
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // initialize factorial variable
            int i = 1; // initialize counter
            
            while (i <= n) { // loop to calculate factorial
                factorial *= i; // multiply current number to factorial
                i++; // increment counter
            }
            
            // print result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }
        
        scanner.close(); // close scanner
    }
}
