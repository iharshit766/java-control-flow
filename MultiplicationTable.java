import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter a number: "); // ask user for input
        int number = scanner.nextInt(); // read user input
        
        for (int i = 6; i <= 9; i++) { // loop from 6 to 9
            System.out.println(number + " * " + i + " = " + (number * i)); // print multiplication result
        }
        
        scanner.close(); // close scanner
    }
}
