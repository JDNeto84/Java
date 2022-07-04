package Heritage;

public class Drivers extends Employees {

    private char driverLicense;

    public Drivers() {
        super();
    }

    public void DisplayInformation() {

        System.out.println(
                "The drive: " + getFullName() + " has a driver's license with the category " + getDriverLicense());

    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(char driverLicense) {
        this.driverLicense = driverLicense;
    }

}
