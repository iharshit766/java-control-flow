import java.util.Scanner;

public class RocketLaunch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number to start countdown: "); // ask user to enter a number
        int counter = scanner.nextInt(); // read the number
        
        // for loop to countdown from the given number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // print current count
        }
        
        System.out.println("Liftoff!"); // print liftoff after countdown
        
        scanner.close(); // close scanner
    }
}
