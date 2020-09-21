
/**
 * Manager
 */
public class Manager extends Employee {

    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 1000;
    }

    @Override
    public int getId() {

        return super.getId() + 100;

    }

    @Override
    public String toString() {

        return this.getFirstName() + "," + this.getId() + "," + this.getAnnualSalary();
    }

}