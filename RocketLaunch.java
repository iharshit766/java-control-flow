import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number to start countdown: "); // ask user to enter a number
        int counter = scanner.nextInt(); // read the number
        
        // while loop to countdown from the given number to 1
        while (counter >= 1) {
            System.out.println(counter); // print current count
            counter--; // decrement counter
        }
        
        System.out.println("Liftoff!"); // print liftoff after countdown
        
        scanner.close(); // close scanner
    }
}
