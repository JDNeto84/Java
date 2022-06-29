
/** Make an algorithm that receives two numbers and at the end shows the addition, subtraction, multiplication, and division
of the two numbers read */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        float numberOne;
        float numberTwo;

        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter the Number 1:");

        numberOne = inputScan.nextInt();

        System.out.println("Enter the Number 2:");

        numberTwo = inputScan.nextInt();

        System.out.println("The addition result is:");

        System.out.println(numberOne + numberTwo);

        System.out.println("The Subtraction result is:");

        System.out.println(numberOne - numberTwo);

        System.out.println("The Multiplication result is:");

        System.out.println(numberOne * numberTwo);

        System.out.println("The Division result is:");

        System.out.println(numberOne / numberTwo);

    }
}