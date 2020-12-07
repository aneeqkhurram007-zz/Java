public class product implements billing {
    private int pID;
    private String pName;
    private double pPrice;
    private static int count = 0;

    public int getpID() {
        return pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public product() {
        count += 100;
        this.pName = "no item";
        this.pPrice = 0;
        this.pID = count;
    }

    public product(String pName, double pPrice) {
        count += 100;
        this.pID = count;
        this.pName = pName;
        this.pPrice = pPrice;

    }

    public static double purchaseBill(product[] billing) {
        double total = 0;
        for (product product : billing) {
            total += product.getpPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        return "ID: " + pID + " " + pName + " = " + pPrice;
    }

    @Override
    public double purchaseBill() {
        return pPrice;
    }
}
