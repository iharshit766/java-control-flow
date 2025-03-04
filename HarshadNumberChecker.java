import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        // prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // read the number from user
        scanner.close(); // close scanner to prevent resource leak

        int sum = 0; // variable to store sum of digits
        int originalNumber = number; // store original number for checking later

        // extract digits and calculate sum of digits
        while (number > 0) {
            int digit = number % 10; // get the last digit
            sum += digit; // add digit to sum
            number /= 10; // remove last digit
        }

        // check if original number is divisible by sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
    }
}
