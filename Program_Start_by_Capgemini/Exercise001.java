
/** Make an algorithm that takes two numbers and displays the result of their sum */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter the Number 1:");

        numberOne = inputScan.nextInt();

        System.out.println("Enter the Number 2:");

        numberTwo = inputScan.nextInt();

        System.out.println("The sum result is:");

        System.out.println(numberOne + numberTwo);

    }
}