import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int counter = 1; // Initialize counter variable

            // While loop to find factors
            while (counter <= number) {
                if (number % counter == 0) { // Check if divisible
                    System.out.print(counter + " ");
                }
                counter++; // Increment counter
            }
        }

        scanner.close(); // Close scanner
    }
}
