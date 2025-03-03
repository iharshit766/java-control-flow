import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object

        // taking age input
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        // taking height input
        System.out.print("Enter height of Amar (in cm): ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        int heightAnthony = scanner.nextInt();

        // finding youngest
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = (minAge == ageAmar) ? "Amar" : (minAge == ageAkbar) ? "Akbar" : "Anthony";

        // finding tallest
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = (maxHeight == heightAmar) ? "Amar" : (maxHeight == heightAkbar) ? "Akbar" : "Anthony";

        // displaying results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close(); // close scanner
    }
}
