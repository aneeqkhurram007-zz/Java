import java.time.LocalDate;

public abstract class Employee {
    private String lastName;
    private String firstName;
    private Integer ssn;
    private LocalDate birthDate;
    private double payRoll;

    public abstract double earnings();

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee \nFirstName=" + getFirstName() + "\nLastName=" + getLastName() + "\nSSN Number = " + getSsn()
                + "\nPayRoll per Month = " + earnings() + "\nBirthDate = " + getBirthDate();
    }

    public Employee(String lastName, String firstName, Integer ssn, LocalDate birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setBirthDate(birthDate);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getPayRoll() {
        return payRoll + earnings();
    }

    public void setPayRoll(double payRoll) {
        this.payRoll = payRoll;
    }

}
