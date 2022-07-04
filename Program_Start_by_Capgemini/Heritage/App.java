package Heritage;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        Sellers seller = new Sellers();
        seller.setFullName("Joao");
        seller.setWage(1000.0f);
        seller.setCPF("12345678900");
        seller.setBirthDate(new Date());
        seller.setCommissions(10.0f);
        seller.setAllSales(10);

        System.out.println("The seller's salary is: " + seller.CalculateSalary());

        Drivers drive = new Drivers();
        drive.setFullName("Neto");
        drive.setWage(1000.0f);
        drive.setCPF("98765432100");
        drive.setBirthDate(new Date());
        drive.setDriverLicense('A');

        drive.DisplayInformation();

    }

}
