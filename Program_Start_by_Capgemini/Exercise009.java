
/** Create an algorithm that takes a value and displays the value with yield after a
    month. Consider fixed interest of 0.07% a.m. */

    import java.text.DecimalFormat;
    import java.util.Scanner;
    
    public class App {
        public static void main(String[] args) throws Exception {
    
            float amountValue = 0;
            double estInterest = 0.0007;
    
            try (Scanner inputScan = new Scanner(System.in)) {
    
                System.out.println("Enter the amount value:");
                amountValue = inputScan.nextFloat();
    
            }
    
            double amountInterest = amountValue * estInterest;
    
            System.out.println("Interest per month " + new DecimalFormat("#,##0.0000").format(amountInterest));
    
        }
    }