import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter three numbers: "); // ask user to enter three numbers
        int number1 = scanner.nextInt(); // read first number
        int number2 = scanner.nextInt(); // read second number
        int number3 = scanner.nextInt(); // read third number
        
        // check if each number is the largest
        boolean isFirstLargest = number1 > number2 && number1 > number3;
        boolean isSecondLargest = number2 > number1 && number2 > number3;
        boolean isThirdLargest = number3 > number1 && number3 > number2;
        
        // print results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        
        scanner.close(); // close scanner
    }
}
