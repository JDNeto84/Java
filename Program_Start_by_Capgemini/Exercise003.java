
/** Write an algorithm to determine the average consumption of a car given the distance
total traveled by car and the total amount of fuel used */

import java.util.Scanner;

public class Exercise003 {

    public static void main(String[] args) {

        float totalDistance;
        float spentFuel;

        try (var inputScan = new Scanner(System.in)) {
            System.out.println("what is the distance traveled?");

            totalDistance = inputScan.nextInt();

            System.out.println("what fuel is used?");

            spentFuel = inputScan.nextInt();
        }

        System.out.println("the average fuel consumption is: ");

        System.out.println(totalDistance / spentFuel);

    }
}