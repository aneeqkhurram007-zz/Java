public class CountedProduct extends product {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CountedProduct(String pName, double pPrice, int quantity) {
        super(pName, pPrice);
        this.quantity = quantity;
    }

    @Override
    public double getpPrice() {

        return super.getpPrice() * quantity;
    }

    @Override
    public double purchaseBill() {
        return getpPrice();
    }

    public static double purchaseBill(product[] billing) {
        double subTotal = 0;
        for (product product : billing) {
            if (product instanceof CountedProduct) {
                subTotal += product.getpPrice();
            }
        }

        return subTotal;
    }

    @Override
    public String toString() {
        return super.toString() + " " + quantity + " units";
    }

}
