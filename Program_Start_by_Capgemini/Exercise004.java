
/** Write an algorithm that reads a salesperson's name, their fixed salary and the total sales made
for it in the month (in cash). Knowing that this seller earns 15% commission on their sales
made, inform your name, fixed salary and salary at the end of the month. */

import java.util.Scanner;

public class Exercise004 {

    public static void main(String[] args) {

        String whichName;
        float fixedSalary = 0;
        float salesAmount = 0;
        try (Scanner inputScan = new Scanner(System.in)) {
            System.out.println("Inform your name:");
            whichName = inputScan.next();
            System.out.println("Inform your salary:");
            fixedSalary = inputScan.nextFloat();
            System.out.println("Inform your Sales");
            salesAmount = inputScan.nextFloat();
        }
       
        double commission = salesAmount * 0.15;

        System.out.println(whichName + " your salary is: $" + fixedSalary + " your sales commissions is: $" + commission);

    }

}