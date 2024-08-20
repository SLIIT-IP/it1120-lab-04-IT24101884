import java.util.Scanner;

public class IT24101884Lab4Q2 {

    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double ExamMarks = inputMarks(scanner, "Please enter exam marks (out of 100): ");
        if (ExamMarks == -1) return;

        double LabMarks = inputMarks(scanner, "Please enter lab submission marks (out of 100): ");
        if (LabMarks == -1) return;

        double ExamPercentage, LabPercentage;
		
        System.out.print("Please enter the percentage given for the exam: ");
        ExamPercentage = scanner.nextDouble();
		
        System.out.print("Please enter the percentage given for the lab submission: ");
        LabPercentage = scanner.nextDouble();

        if (ExamPercentage + LabPercentage != 100) {
            System.out.println("Invalid input for percentages. Terminating program.");
            return;
        }

        double FinalMark = (ExamMarks * ExamPercentage / 100) + (LabMarks * LabPercentage / 100);
        System.out.println("Final Exam Mark is: " + FinalMark);
    }

    private static double inputMarks(Scanner scanner, String prompt) {
        System.out.print(prompt);
		
        double Marks = scanner.nextDouble();
		
        if (Marks < 0 || Marks > 100) {
            System.out.println("Invalid input for marks. Terminating program.");
            return -1; 
        }
        return Marks;
    }
}
