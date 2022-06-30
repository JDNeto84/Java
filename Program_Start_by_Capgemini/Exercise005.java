
/** Write an algorithm that reads a student's name and grades from the three exams he took in the semester.
At the end, inform the student's name and his arithmetic mean */

import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) throws Exception {

        String whichName;
        float testGrade1;
        float testGrade2;
        float testGrade3;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform your name:");
            whichName = inputScan.nextLine();
            System.out.println("Report the note 1:");
            testGrade1 = inputScan.nextFloat();
            System.out.println("Report the note 2");
            testGrade2 = inputScan.nextFloat();
            System.out.println("Report the note 3");
            testGrade3 = inputScan.nextFloat();

        }

        float average = (testGrade1 + testGrade2 + testGrade3) / 3;

        System.out.println(whichName + " your average is: " + average);

    }
}
