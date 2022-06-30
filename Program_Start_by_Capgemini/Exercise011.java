
/** Make an algorithm that takes the cost price of a product and displays the sale value. It is known that the
    the cost price will be increased according to a percentage informed by the user. */

    import java.text.DecimalFormat;
    import java.util.Scanner;
    
    public class App {
        public static void main(String[] args) throws Exception {
    
            float productsValue = 0;
            float percentageValue = 0;
    
            try (Scanner inputScan = new Scanner(System.in)) {
    
                System.out.println("Enter product value:");
                System.out.print("$ ");
                productsValue = inputScan.nextFloat();
                System.out.println("Enter percentage value:");
                System.out.print("% ");
                percentageValue = inputScan.nextFloat();
    
            }
    
            float saleValue = percentageValue / 100 * productsValue + productsValue;
    
            System.out.println("The sale value is $ " + new DecimalFormat("#,##0.00").format(saleValue));
    
        }
    }