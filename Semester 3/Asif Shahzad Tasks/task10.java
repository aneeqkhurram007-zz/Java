
import java.util.*;

public class task10 {
    public static void main(String[] args) {
        /*
         * Calculate total salary based on commission and bonus. Get sale amount from
         * user input. Assume, 2% commission when sales is less than or equals to
         * 100,000. 1.5% commission if sales above 100,000 and below 300,000 with
         * additional bonus of 2000. 1% if sales above 300,000 with 3000 bonus.
         * Calculate total payables to employee, assume fix salary is 25,000 (which is
         * minimum salary of employee and always paid, irrespective of sales)?
         */

        Scanner input = new Scanner(System.in);
        double salary = 25000, totalSalary, commission, bonus, sales;
        System.out.print("Enter Sales Amount: ");
        sales = input.nextDouble();
        if (sales <= 100000) {
            commission = 0.02 * sales;
            bonus = 0;
        } else if (sales > 100000 && sales <= 300000) {
            commission = 0.015 * sales;
            bonus = 2000;

        } else {
            commission = 0.01 * sales;
            bonus = 3000;

        }
        totalSalary = salary + commission + bonus;
        System.out.println("Total Salary is : " + totalSalary);
        input.close();

    }
}
