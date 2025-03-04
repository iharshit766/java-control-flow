import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input
        System.out.print("Enter a year: "); // prompt user for year input
        int year = scanner.nextInt(); // read year integer input
        scanner.close(); // close scanner to avoid resource leak
        
        if (year < 1582) { // check if year is valid for Gregorian calendar
            System.out.println("Invalid input! Year must be 1582 or later.");
            return; // exit program if input is invalid
        }
        
        // using multiple if-else statements
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        // using a single if statement with logical operators
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
