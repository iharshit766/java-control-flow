import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        System.out.print("Enter a number: "); // prompt user to enter a number
        int number = scanner.nextInt(); // read the number from user
        scanner.close(); // close scanner to prevent resource leak

        boolean isPrime = true; // assume the number is prime initially

        if (number <= 1) { // check if number is 1 or less
            isPrime = false; // numbers <= 1 are not prime
        } else {
            for (int i = 2; i < number; i++) { // loop from 2 to number-1
                if (number % i == 0) { // check if number is divisible by i
                    isPrime = false; // number is not prime
                    break; // exit loop early
                }
            }
        }

        // print result based on isPrime value
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
