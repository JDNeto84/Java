package Heritage;

public class Sellers extends Employees {

    private int allSales;
    private float commissions;

    public Sellers() {
        super();
    }

    public float CalculateSalary() {

        return super.getWage() + this.commissions * allSales;

    }

    public int getAllSales() {
        return allSales;
    }

    public void setAllSales(int allSales) {
        this.allSales = allSales;
    }

    public float getCommissions() {
        return commissions;
    }

    public void setCommissions(float commissions) {
        this.commissions = commissions;
    }

}
