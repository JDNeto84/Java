
/** Body Mass Index */

package BMI;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        People person = new People(90.0f, 1.80f);

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform your weight:");

            person.setWeightPerson(inputScan.nextFloat());

            System.out.println("Inform your height:");

            person.setHeightPerson(inputScan.nextFloat());

        }

        System.out.println("Your BMI = " + person.calcBMI());

        person.returnBMI();

    }

}