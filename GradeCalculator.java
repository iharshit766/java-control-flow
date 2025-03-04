import java.util.Scanner; 
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create Scanner object to take input

        // input marks for three subjects
        System.out.print("Enter marks in Physics: "); // prompt user for Physics marks
        int physics = scanner.nextInt(); // read Physics marks

        System.out.print("Enter marks in Chemistry: "); // prompt user for Chemistry marks
        int chemistry = scanner.nextInt(); // read Chemistry marks

        System.out.print("Enter marks in Maths: "); // prompt user for Maths marks
        int maths = scanner.nextInt(); // read Maths marks

        scanner.close(); // close scanner to prevent resource leak

        // calculate average percentage
        double average = (physics + chemistry + maths) / 3.0; // compute the average

        // declare variables to store grade and remarks
        String grade;
        String remarks;

        // determine grade and remarks based on average marks
        if (average >= 80) { // check if average is 80 or above
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) { // check if average is between 70-79
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) { // check if average is between 60-69
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) { // check if average is between 50-59
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) { // check if average is between 40-49
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else { // if average is below 40
            grade = "R";
            remarks = "Remedial standards";
        }

        // display results
        System.out.println("\nAverage Marks: " + average); // print average marks
        System.out.println("Grade: " + grade); // print grade
        System.out.println("Remarks: " + remarks); // print remarks based on grade
    }
}
