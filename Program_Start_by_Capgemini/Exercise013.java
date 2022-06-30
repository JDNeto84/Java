
/** Make an algorithm that receives a number and displays a message if this number is greater than 10. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numberReported;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform a number:");

            numberReported = inputScan.nextInt();

        }

        if (numberReported > 10) {
            System.out.println("The number entered is greater than 10");
        } else {
            System.out.println("The number entered is less than 10");
        }
    }
}
