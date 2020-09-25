
import java.util.*;

public class task9 {
    public static void main(String[] args) {
        /*
         * Get the basic salary of employee from user input, write a program that shall
         * calculate gross salary using given details: for basic aalary below 10000,
         * house rent allowance is 50% and medical allowance is 10% for basic salary
         * between 10000 and 20000, HRA = 60% and MA = 15% when Basic Salary is above
         * 20000, HRA = 70% and MA = 20%
         */

        Scanner input = new Scanner(System.in);
        double basicSalary, HRA, MA, grossSalary;
        System.out.print("Enter your basic Salary: ");
        basicSalary = input.nextDouble();
        if (basicSalary < 10000) {
            HRA = 0.5 * basicSalary;
            MA = 0.1 * basicSalary;
        } else if (basicSalary >= 10000 && basicSalary <= 20000) {
            HRA = 0.6 * basicSalary;
            MA = 0.15 * basicSalary;
        } else {
            HRA = 0.7 * basicSalary;
            MA = 0.2 * basicSalary;
        }
        grossSalary = basicSalary + HRA + MA;
        System.out.println("Your Gross Salary is : " + grossSalary);
        input.close();

    }
}
