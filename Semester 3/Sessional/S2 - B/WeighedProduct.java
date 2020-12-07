public class WeighedProduct extends product {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WeighedProduct(String pName, double pPrice, double weight) {
        super(pName, pPrice);
        this.weight = weight;
    }

    @Override
    public double getpPrice() {

        return super.getpPrice() * weight;
    }

    @Override
    public double purchaseBill() {
        return getpPrice();
    }

    public static double purchaseBill(product[] billing) {
        double subTotal = 0;
        for (product product : billing) {
            if (product instanceof WeighedProduct) {
                subTotal += product.getpPrice();
            }
        }

        return subTotal;
    }

    @Override
    public String toString() {
        return super.toString() + " " + weight + "Kg";
    }

}
