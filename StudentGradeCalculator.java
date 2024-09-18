import java.util.Scanner;

public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of subjects: ");
            int Subjects = scanner.nextInt();
            int[] marks = new int[Subjects];
            int totalMarks = 0;
            int maxMarks = 0;
            for (int i = 0; i < Subjects; i++) {
                System.out.print("Enter maximum marks for the subject " + (i + 1) + ": ");
                int maxMark = scanner.nextInt();
                maxMarks += maxMark;
                System.out.print("Enter marks obtained in the subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }
            double avg_percent = (double) totalMarks / maxMarks * 100;
            String grade = "";
            if (avg_percent >= 90) {
                grade = "A+";
            } else if (avg_percent >= 80) {
                grade = "A";
            } else if (avg_percent >= 70) {
                grade = "B";
            } else if (avg_percent >= 60) {
                grade = "C";
            } else if (avg_percent >=40) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Total marks: " + totalMarks);
            System.out.println("Average percentage: " + avg_percent + "%");
            System.out.println("Grade: "+grade);
}
    }