
public class InvoiceItem extends Item {
    private float price;
    private int quantity;
    private float discount;
    private boolean available;

    public InvoiceItem(int id, String name, float price, int quantity) {
        super(id, name);
        setPrice(price);
        setQuantity(quantity);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public float computePrice() {
        return getPrice() * getQuantity() - getPrice() * (getDiscount() / 100);
    }

    @Override
    public void changeState(boolean state) {
        setAvailable(state);
    }

    @Override
    public void reset() {
        setAvailable(false);
    }

    @Override
    public String toString() {
        return "\nInvoice Item\n" + super.toString() + "\nPrice : " + price + "\tQuantity : " + quantity + "\nTotal : "
                + computePrice() + " (@ " + getDiscount() + " % discount)";

    }
}
