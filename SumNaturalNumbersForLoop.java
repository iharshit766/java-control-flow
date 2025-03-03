import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a natural number: "); // ask user for input
        int n = scanner.nextInt(); // read user input
        
        if (n < 0) { // check if input is a natural number
            System.out.println("The number " + n + " is not a natural number");
        } else {
            int sumFor = 0; // initialize sum variable
            for (int i = 1; i <= n; i++) { // loop to calculate sum
                sumFor += i; // add current number to sum
            }
            
            int sumFormula = n * (n + 1) / 2; // calculate sum using formula
            
            // print both results
            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            
            // compare results
            if (sumFor == sumFormula) {
                System.out.println("Both computations match. The sum is correct.");
            } else {
                System.out.println("Mismatch in computation.");
            }
        }
        
        scanner.close(); // close scanner
    }
}
