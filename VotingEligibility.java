import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter the person's age: "); // ask user to enter age
        int age = scanner.nextInt(); // read the age
        
        // check if age is 18 or above
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        scanner.close(); // close scanner
    }
}
