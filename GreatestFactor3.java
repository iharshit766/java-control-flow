import java.util.Scanner;

public class GreatestFactor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input
        System.out.print("Enter a number: "); // prompt user for input
        int number = scanner.nextInt(); // read integer input
        scanner.close(); // close scanner to avoid resource leak
        
        int greatestFactor = 1; // initialize greatest factor to 1
        int counter = number - 1; // start counter from number-1
        
        while (counter > 0) { // loop until counter is 1
            if (number % counter == 0) { // check if counter is a factor of number
                greatestFactor = counter; // update greatest factor
                break; // exit the loop once the greatest factor is found
            }
            counter--; // decrease counter
        }
        
        System.out.println("Greatest factor beside itself: " + greatestFactor); // print result
    }
}
