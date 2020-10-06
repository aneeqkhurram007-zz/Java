
import java.util.*;

public class DateMain {
    public static void main(String[] args) {
        int day, month, year;
        Scanner input = new Scanner(System.in);
        Date d1 = new Date();
        System.out.print("\nEnter Date: ");
        day = input.nextInt();
        System.out.print("\nEnter Month: ");
        month = input.nextInt();
        System.out.print("\nEnter Year: ");
        year = input.nextInt();
        Date d2 = new Date(day, month, year);
        d1.printDate();
        d2.printDate();
        Date d3 = new Date(); // Date Class from java.util.*;
        Date d4 = new Date(); // Date Class from java.util.*;
        d3 = d2;
        d4 = d3;
        d3.setMonth(03);
        System.out.println("After Effects");
        d1.printDate();
        d2.printDate();
        d3.printDate();
        d4.printDate();
        input.close();
    }
}
