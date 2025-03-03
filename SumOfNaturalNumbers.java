import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number: "); // ask user to enter a number
        int number = scanner.nextInt(); // read the number
        
        // check if number is a natural number (0 or positive integer)
        if (number >= 0) {
            int sum = number * (number + 1) / 2; // calculate sum using formula
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        
        scanner.close(); // close scanner
    }
}
