import java.util.Date;

public class Milk extends Item {
    protected String brand;
    private Date expiryDate;
    protected int price;

    public Milk(String brand, Date expiryDate) {
        this.brand = brand;
        this.expiryDate = expiryDate;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public void featuresOfProduct() {
        System.out.println("Brand: " + brand + "\nExpiry Date: " + expiryDate + "\nPrice: " + price);
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nExpiry Date: " + expiryDate + "\nPrice: " + price;
    }
}
