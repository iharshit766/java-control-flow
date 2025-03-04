import java.util.Scanner;

public class PowerCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input
        System.out.print("Enter the base number: "); // prompt user for base input
        int number = scanner.nextInt(); // read base integer input
        
        System.out.print("Enter the power: "); // prompt user for power input
        int power = scanner.nextInt(); // read power integer input
        scanner.close(); // close scanner to avoid resource leak
        
        if (power < 0) { // check if power is a positive integer
            System.out.println("Invalid input! Power must be a non-negative integer.");
            return; // exit program if input is invalid
        }
        
        int result = 1; // initialize result to 1
        int counter = 0; // initialize counter to 0
        
        while (counter < power) { // loop until counter equals power
            result *= number; // multiply result by number in each iteration
            counter++; // increment counter
        }
        
        System.out.println(number + " raised to the power of " + power + " is: " + result); // print the result
    }
}
