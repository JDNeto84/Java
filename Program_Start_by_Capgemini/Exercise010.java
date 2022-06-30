
/** The Papaya with Sugar store is selling its products in 5 interest-free installments. 
 Make the algorithm that receives an amount from purchase and shows the value of the installments. */

 import java.text.DecimalFormat;
 import java.util.Scanner;
 
 public class App {
     public static void main(String[] args) throws Exception {
 
         float productsValue = 0;
 
         try (Scanner inputScan = new Scanner(System.in)) {
 
             System.out.println("Enter product value:");
             productsValue = inputScan.nextFloat();
 
         }
 
         for (int i = 1; i < 6; i++) {
 
             System.out.println(
                     "Installment value " + (i) + " is: " + new DecimalFormat("#,##0.00").format(productsValue / 5));
         }
 
     }
 }