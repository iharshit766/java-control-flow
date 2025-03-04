import java.util.Scanner; // import scanner class for user input

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object for input

        // prompt user for input
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt(); // read month
        
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt(); // read day
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt(); // read year
        
        scanner.close(); // close scanner to prevent resource leak

        // applying formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // array to store day names
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // display result
        System.out.println("The day of the week is: " + days[d0]);
    }
}
