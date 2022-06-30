
/** Write an algorithm that reads the student's name and three grades earned during the semester. calculate
arithmetic average, inform the name and mention of approved if average >= 7, Failed if average <= 5 and
Recovery average between 5.1 to 6.9 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String inputName = "";
        float[] arrayGrade = new float[3];
        float averageGrade = 0;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform your name:");

            inputName = inputScan.nextLine();

            for (int i = 0; i < 3; i++) {

                System.out.println("Report the note:");

                arrayGrade[i] = inputScan.nextFloat();
                averageGrade += arrayGrade[i];
            }

            averageGrade = averageGrade / 3;

            System.out.println(averageGrade);

            if (averageGrade >= 7) {

                System.out.println(inputName + " aproved with the arithmetic average " + averageGrade);

            } else {

                if (averageGrade > 5.099) {

                    System.out.println(inputName + " recovery with the arithmetic average " + averageGrade);

                } else {
                    System.out.println(inputName + " reproved with the arithmetic average " + averageGrade);
                }
            }

        }

    }

}