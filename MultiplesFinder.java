import java.util.Scanner;

public class MultiplesFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input
        System.out.print("Enter a positive integer less than 100: "); // prompt user for input
        int number = scanner.nextInt(); // read integer input
        scanner.close(); // close scanner to avoid resource leak
        
        if (number <= 0 || number >= 100) { // check if input is valid
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
            return; // exit program if input is invalid
        }
        
        System.out.println("Multiples of " + number + " below 100:");
        
        for (int i = 100; i > 0; i--) { // loop from 100 down to 1
            if (i % number == 0) { // check if 'i' is a multiple of 'number'
                System.out.println(i); // print the multiple
            }
        }
    }
}
