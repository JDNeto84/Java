
/** Develop an algorithm that performs the presentation of the conversion value from real (R$) to dollar (US$).
    The algorithm should request the dollar quote value and also the amount of dollars available to the user. */

    import java.util.Scanner;

    public class App {
        public static void main(String[] args) throws Exception {
    
            float realValue = 0;
            float dolarPrice = 0;
            
    
            try (Scanner inputScan = new Scanner(System.in)) {
    
                System.out.println("Enter the value in reais:");
                realValue = inputScan.nextFloat();
                System.out.println("Enter dollar quote:");
                dolarPrice = inputScan.nextFloat();
            }
    
            System.out.println("The amount of conversion from R$" + realValue + " to US$" + realValue / dolarPrice);
    
        }
    }