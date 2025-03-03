import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a natural number: "); // ask user for input
        int number = scanner.nextInt(); // read user input
        
        if (number < 1) { // check if input is a natural number
            System.out.println("The number " + number + " is not a natural number");
        } else {
            for (int i = 1; i <= number; i++) { // loop from 1 to given number
                if (i % 2 == 0) { // check if even
                    System.out.println(i + " is an even number.");
                } else { // if not even, then odd
                    System.out.println(i + " is an odd number.");
                }
            }
        }
        
        scanner.close(); // close scanner
    }
}
