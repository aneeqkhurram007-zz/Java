import java.util.Date;
import java.util.Scanner;

public class falvouredMilk extends Milk {
    private String flavour;
    private Scanner input = new Scanner(System.in);

    public falvouredMilk(String brand, Date expiryDate, String flavour) {
        super(brand, expiryDate);
        this.flavour = flavour;
        System.out.println("Enter price: ");
        setPrice(input.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "\nFlavour: " + flavour;
    }

    public void readyToSell(Object o) {
        sell(o);
    }
}
