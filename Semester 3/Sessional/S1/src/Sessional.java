import java.util.*;

public class Sessional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Medicine medicine1 = new Medicine(null, 0, 0);
        Medicine medicine2 = new Medicine(null, 0, 0);

        Date manufDate1 = new Date();
        Date manufDate2 = new Date();
        Date expDate1 = new Date();
        Date expDate2 = new Date();

        medicine1.setInputs();
        medicine1.manufactureDate(manufDate1);
        medicine1.expiryDate(expDate1);

        medicine2.setInputs();
        medicine2.manufactureDate(manufDate2);
        medicine2.expiryDate(expDate2);

        System.out.println("\n-------------------Medicine Information-------------------");
        display(medicine1, manufDate1, expDate1);
        display(medicine2, manufDate2, expDate2);

        lifeSpan(expDate1, expDate2);
        input.close();
    }

    public static void display(Medicine medicine, Date manufacture, Date expiry) {
        System.out.println("\nMedicine Name: " + medicine.getName());
        System.out.print("Manufacturing Date: ");
        manufacture.display();
        System.out.print("Expiry Date: ");
        expiry.display();
        System.out.printf("Price of Medicine: %.2f\n", medicine.calculatePrice());

    }

    public static void lifeSpan(Date expDate1, Date expDate2) {
        if (expDate1.getYear() == expDate2.getYear()) {
            System.out.println("\nBoth Medicine have same life span");
        } else {
            System.out.println("\nBoth Medicine have different life span");
        }
    }
}