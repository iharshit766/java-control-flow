import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter three numbers: "); // ask user to enter three numbers
        int number1 = scanner.nextInt(); // read first number
        int number2 = scanner.nextInt(); // read second number
        int number3 = scanner.nextInt(); // read third number
        
        // check if first number is the smallest
        boolean isSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isSmallest);
        
        scanner.close(); // close scanner
    }
}
