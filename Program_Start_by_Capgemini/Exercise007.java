
/** Read a temperature in degrees Celsius and show converted to Fahrenheit. formula of
conversion is: F=(9*C+160) / 5, where F is the temperature in Fahrenheit and C is the temperature in Celsius. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int degreesCelsius;
        int degreesFahrenheit;

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform degrees Celsius:");
            degreesCelsius = inputScan.nextInt();

        }

        degreesFahrenheit = (degreesCelsius * 9 + 160) / 5;

        System.out.println(degreesCelsius + "°C to " + degreesFahrenheit + "°F");

    }
}