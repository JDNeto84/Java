
/** Read 80 numbers and at the end inform how many numbers are in the range between 10 and 150 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int checks = 0;
        int counter = 0;

        try (Scanner inputScan = new Scanner(System.in)) {

            for (int i = 0; i < 80; i++) {

                checks = inputScan.nextInt();

                if (checks >= 10 && checks <= 150) {
                    
                    counter++;
                }
            }

        }

        if (counter == 0) {

            System.out.println("no number is in range");

        } else {

            System.out.println("there are " + counter + " numbers in the range");

        }

    }

}