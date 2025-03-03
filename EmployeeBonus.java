import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        
        System.out.print("Enter employee's salary: "); // ask user for salary input
        double salary = scanner.nextDouble(); // read salary input
        
        System.out.print("Enter years of service: "); // ask user for years of service input
        int yearsOfService = scanner.nextInt(); // read years of service input
        
        if (yearsOfService > 5) { // check if service is more than 5 years
            double bonus = salary * 0.05; // calculate 5% bonus
            System.out.println("Bonus amount: " + bonus); // print bonus amount
        } else {
            System.out.println("No bonus awarded."); // print no bonus message
        }
        
        scanner.close(); // close scanner
    }
}
