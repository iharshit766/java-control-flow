import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a positive integer: "); // ask user for input
        int number = scanner.nextInt(); // read user input
        
        if (number > 0) { // check if number is positive
            for (int i = 1; i <= number; i++) { // loop from 1 to number
                if (i % 3 == 0 && i % 5 == 0) { // check for multiples of 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // check for multiples of 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // check for multiples of 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); // print the number if not a multiple of 3 or 5
                }
            }
        } else {
            System.out.println("Please enter a positive integer."); // error message for invalid input
        }
        
        scanner.close(); // close scanner
    }
}
