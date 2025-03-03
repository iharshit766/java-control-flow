import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        double total = 0.0; // initialize total sum to 0
        
        while (true) { // infinite loop to take user input
            System.out.print("Enter a number (0 to stop): "); // ask user for input
            double number = scanner.nextDouble(); // read user input
            
            if (number == 0) { // check if user entered 0
                break; // exit the loop
            }
            
            total += number; // add number to total
        }
        
        System.out.println("The total sum is: " + total); // display total sum
        
        scanner.close(); // close scanner
    }
}
