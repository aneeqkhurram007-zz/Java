import java.util.ArrayList;

public class ItemTester {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        // InvoiceItem
        items.add(new InvoiceItem(220, "Panadol", 55, 4));
        items.add(new InvoiceItem(221, "Azomax", 130, 2));

        if (items.get(1) instanceof InvoiceItem) {
            InvoiceItem invoiceItem = (InvoiceItem) items.get(1);
            invoiceItem.setDiscount(10);
        }
        // PrescriptionItem
        items.add(new PrescriptionItem(225, "Ricotine", 250, 3));
        items.add(new PrescriptionItem(226, "Insulin", 1000, 1));

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
