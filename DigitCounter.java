import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        System.out.print("Enter a number: "); // prompt user to enter a number
        int number = scanner.nextInt(); // read the number from user
        scanner.close(); // close scanner to prevent resource leak

        int count = 0; // variable to store the count of digits
        int originalNumber = number; // store the original number for reference

        if (number == 0) { // special case: if number is 0, it has one digit
            count = 1;
        } else {
            while (number != 0) { // loop until number becomes 0
                number /= 10; // remove the last digit by dividing by 10
                count++; // increase digit count
            }
        }

        System.out.println("The number " + originalNumber + " has " + count + " digits."); // display the count
    }
}
