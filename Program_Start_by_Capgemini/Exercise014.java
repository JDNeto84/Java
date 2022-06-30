
/** write an algorithm that reads two distinct integer values ​​and informs which is the largest number. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numberOne, numberTwo;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform a number:");

            numberOne = inputScan.nextInt();

            System.out.println("Inform a number:");

            numberTwo = inputScan.nextInt();

        }

        if (numberOne == numberTwo) {
            System.out.println("The number " + numberOne + " is the same as the number " + numberTwo);

        } else {
            if (numberOne > numberTwo) {
                System.out.println("The number " + numberOne + " is greater than " + numberTwo);
            } else {
                System.out.println("The number " + numberOne + " is less than " + numberTwo);
            }

        }

    }

}