import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter month (1-12): "); // ask user to enter month
        int month = scanner.nextInt(); // read month
        System.out.print("Enter day (1-31): "); // ask user to enter day
        int day = scanner.nextInt(); // read day
        
        // check if the given date falls in the spring season (March 20 - June 20)
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        
        // print result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        scanner.close(); // close scanner
    }
}
