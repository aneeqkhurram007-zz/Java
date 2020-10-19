import java.util.*;

public class Medicine {
    Scanner input = new Scanner(System.in);
    private String name;
    private double price;
    private double hydrochlorideAmount;
    private int manufDate;

    public static int count = 0;
    public int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHydrochlorideAmount() {

        return this.hydrochlorideAmount;
    }

    public void setHydrochlorideAmount(double hydrochlorideAmount) {
        this.hydrochlorideAmount = hydrochlorideAmount;
    }

    public Medicine(String name, double price, double hydrochlorideAmount) {
        this.name = name;
        this.price = price;
        this.hydrochlorideAmount = hydrochlorideAmount;
        this.id = ++count;
    }

    public Date manufactureDate(Date d) {
        System.out.print("\nEnter Manufacture date: ");
        d.setDay(input.nextInt());
        d.setMonth(input.nextInt());
        d.setYear(input.nextInt());
        manufDate = d.getYear();
        return d;
    }

    public Date expiryDate(Date d) {

        System.out.print("\nEnter Expiry date: ");
        d.setDay(input.nextInt());
        d.setMonth(input.nextInt());
        d.setYear(input.nextInt());
        if (manufDate >= d.getYear()) {
            System.out.println("Expiry Date cannot be less than Manufacturing Date.\nTry Again ");
            d.setYear(input.nextInt());

        }

        return d;

    }

    public double calculatePrice() {
        if (hydrochlorideAmount < 15.5) {
            return (0.17 * price) + price;
        } else {
            return (0.18 * price) + price;
        }
    }

    public void setInputs() {
        System.out.println("\n\tMedicine " + id);
        System.out.print("\nEnter name of medicine: ");
        this.setName(input.nextLine());
        System.out.print("\nEnter price of medicine: ");
        this.setPrice(input.nextDouble());
        System.out.print("\nEnter hydrochloride amount: ");
        this.setHydrochlorideAmount(input.nextDouble());

    }
}
