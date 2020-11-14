import java.time.LocalDate;

public class CreditCardPayment extends Payment {
    private String name;
    private long creditCardNumber;
    private LocalDate expirDate;

    public CreditCardPayment(String name, long creditCardNumber, LocalDate expirDate) {
        setName(name);
        setCreditCardNumber(creditCardNumber);
        setExpirDate(expirDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public LocalDate getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(LocalDate expirDate) {
        this.expirDate = expirDate;
    }

    @Override
    public void paymentDetails() {
        System.out.println("Credit Card Information: ");
        System.out.println("Name: " + getName());
        System.out.println("Credit Card Number: " + getCreditCardNumber());
        System.out.println("Expiry Date: " + getExpirDate());
    }

}
