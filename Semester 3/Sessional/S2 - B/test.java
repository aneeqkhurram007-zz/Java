public class test {
    public static void main(String[] args) {
        product[] billing = new product[4];
        billing[0] = new WeighedProduct("Rice", 3.00, 1.37);
        billing[1] = new WeighedProduct("Bat", 8.00, 5.4);

        billing[2] = new CountedProduct("Ball", 3.2, 5);
        billing[3] = new CountedProduct("Pens", 4.5, 10);

        for (product product : billing) {
            System.out.println(product + " " + product.purchaseBill() + " PKR");
        }
        System.out.println("SubTotal for Counted Products : " + CountedProduct.purchaseBill(billing));
        System.out.println("SubTotal for Weighed Products : " + WeighedProduct.purchaseBill(billing));
        System.out.println("Grand Total = " + product.purchaseBill(billing));

    }
}
