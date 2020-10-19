import java.time.*;

public class Person {

    private String name;
    private LocalDate dateOfBirth;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public void setAge(int age) {
        this.dateOfBirth = LocalDate.of(LocalDate.now().getYear() - age, 1, 1);
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person(String name, String dateOfBirth) {
        setName(name);
        setDateOfBirth(dateOfBirth);
    }

    public String toString() {
        return "Your name is " + this.name + "\nYour Date of Birth is: " + this.dateOfBirth + "\nYour age is: "
                + getAge();
    }
}
