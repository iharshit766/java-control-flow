import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object to take input

        // prompt user for weight in kg
        System.out.print("Enter your weight (kg): ");
        double weight = scanner.nextDouble(); // read weight input

        // prompt user for height in cm
        System.out.print("Enter your height (cm): ");
        double heightCm = scanner.nextDouble(); // read height input
        scanner.close(); // close scanner to prevent resource leak

        // convert height from cm to meters
        double heightMeters = heightCm / 100;

        // calculate BMI using formula BMI = weight / (height * height)
        double bmi = weight / (heightMeters * heightMeters);

        // determine weight status based on BMI range
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // display the BMI and status
        System.out.printf("Your BMI is: %.2f\n", bmi); // print BMI with 2 decimal places
        System.out.println("You are classified as: " + status);
    }
}
