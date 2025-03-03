import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a natural number: "); // ask user for input
        int n = scanner.nextInt(); // read user input
        
        if (n < 0) { // check if input is a natural number
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sumWhile = 0, i = 1; // initialize variables for while loop sum
            while (i <= n) { // loop to calculate sum
                sumWhile += i; // add current number to sum
                i++; // increment counter
            }
            
            int sumFormula = n * (n + 1) / 2; // calculate sum using formula
            
            // print both results
            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            
            // compare results
            if (sumWhile == sumFormula) {
                System.out.println("Both computations match. The sum is correct.");
            } else {
                System.out.println("Mismatch in computation.");
            }
        }
        
        scanner.close(); // close scanner
    }
}
