import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        System.out.print("Enter a number: "); // prompt user to enter a number
        int number = scanner.nextInt(); // read number from user
        scanner.close(); // close scanner to prevent resource leak

        int sum = 0; // variable to store sum of cubes of digits
        int originalNumber = number; // store original number to compare later

        while (originalNumber != 0) { // loop until originalNumber becomes 0
            int digit = originalNumber % 10; // extract last digit
            sum += digit * digit * digit; // add cube of digit to sum
            originalNumber /= 10; // remove last digit by dividing by 10
        }

        // check if sum of cubes is equal to original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}
