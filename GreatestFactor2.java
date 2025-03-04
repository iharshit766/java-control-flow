import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input
        System.out.print("Enter a number: "); // prompt user for input
        int number = scanner.nextInt(); // read integer input
        scanner.close(); // close scanner to avoid resource leak
        
        int greatestFactor = 1; // initialize greatest factor to 1
        
        for (int i = number - 1; i > 0; i--) { // loop from number-1 down to 1
            if (number % i == 0) { // check if 'i' is a factor of 'number'
                greatestFactor = i; // update greatest factor
                break; // exit the loop once the greatest factor is found
            }
        }
        
        System.out.println("Greatest factor beside itself: " + greatestFactor); // print result
    }
}
