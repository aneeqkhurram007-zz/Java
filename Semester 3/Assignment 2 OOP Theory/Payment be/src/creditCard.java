public class creditCard extends payment {
    private String name;
    private int creditCard;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public creditCard(String name, int creditCard, String date) {
        this.name = name;
        this.creditCard = creditCard;
        this.date = date;
    }

    public void paymentDetails() {
        System.out.println("Payment Details: ");
        System.out.println("Your Name: " + this.name);
        System.out.println("Your Credit Card Number: " + this.creditCard);
        System.out.println("Expiry Date: " + this.date);
    }
}
