import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        // prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // read the number from user
        scanner.close(); // close scanner to prevent resource leak

        int sum = 0; // variable to store sum of divisors

        // loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // check if i is a divisor
                sum += i; // add divisor to sum
            }
        }

        // check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}
