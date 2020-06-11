
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
        // TODO Auto-generated method stub
        return this.getFirstName() + "," + this.getId() + "," + this.getAnnualSalary();
    }

}