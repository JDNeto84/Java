
/** Make an algorithm that is receiving a number and tells if this number is in the range between 100 and 200. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numberInf;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform a number:");

            numberInf = inputScan.nextInt();

        }

        if (numberInf >= 100 && numberInf <= 200) {
            System.out.println("The number " + numberInf + " is in the range of 100 to 200");
        } else {
            System.out.println("The number " + numberInf + " is not in the range of 100 to 200");
        }

    }

}