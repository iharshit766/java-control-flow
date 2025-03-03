import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter a number: "); // ask user to enter a number
        int number = scanner.nextInt(); // read the number
        
        // check if number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        scanner.close(); // close scanner
    }
}
