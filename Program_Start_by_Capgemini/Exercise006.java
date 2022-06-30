
/** Read two values ​​of variable A and B, perform the value exchange, so that variable A receives the value of variable B, and variable B receives the value of variable A, Display the values
of the changes */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String a = "";
        String b = "";
        String x = "";

        try (Scanner inputScan = new Scanner(System.in)) {

            System.out.println("Inform String A:");
            a = inputScan.nextLine();
            System.out.println("Inform String B:");
            b = inputScan.nextLine();

        }

        System.out.println(a + " " + b);

        x = a;
        a = b;
        b = x;

        System.out.println(a + " " + b);

    }
}