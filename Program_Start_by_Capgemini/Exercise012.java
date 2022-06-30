
/** Make an algorithm that takes the cost price of a product and displays the sale value. It is known that the
    the cost price will be increased according to a percentage informed by the user. */

    import java.text.DecimalFormat;
    import java.util.Scanner;
    
    public class App {
        public static void main(String[] args) throws Exception {
    
            float factoryCost = 0;
            double manufacturingTaxes = 0.45;
            double distributionProfit = 0.28;
    
            try (Scanner inputScan = new Scanner(System.in)) {
    
                System.out.println("Enter factory cost:");
                System.out.print("$ ");
                factoryCost = inputScan.nextFloat();
    
            }
    
            double purchasePrice = factoryCost * manufacturingTaxes + factoryCost;
            double salePrice = purchasePrice * distributionProfit + purchasePrice;
    
            System.out.println("The sale value is $ " + new DecimalFormat("#,##0.00").format(salePrice));
    
        }
    }