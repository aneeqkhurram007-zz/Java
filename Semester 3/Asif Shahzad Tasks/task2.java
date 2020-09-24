import java.util.*;

public class task2 {
    public static void main(String[] args) {
        /*
         * Declare and initialize byte, short, int, float, long, double, boolean type
         * variables using literals, change those values by user input and then print
         * all of 7 variables on console. (in lab video, you have already seen, how to
         * get input from user using Scanner class)
         */
        Scanner input = new Scanner(System.in);
        // Hard Core Literals
        byte a = 127;
        short b = 32000;
        int c = 655535;
        float d = 654.65f;
        double e = 3445823.6545;
        boolean f = true;
        // User Input
        System.out.println("Enter Byte value for a = ");
        a = input.nextByte();
        System.out.println("Enter Short value for b = ");
        b = input.nextShort();
        System.out.println("Enter Int value for c = ");
        c = input.nextInt();
        System.out.println("Enter Float value for d = ");
        d = input.nextFloat();
        System.out.println("Enter Double value for e = ");
        e = input.nextDouble();
        System.out.println("Enter Boolean value for f = ");
        f = input.nextBoolean();
        // Print
        System.out.println("Byte = " + a);
        System.out.println("Short = " + b);
        System.out.println("Int = " + c);
        System.out.println("Float = " + d);
        System.out.println("Double = " + e);
        System.out.println("Boolean = " + f);
        input.close();
    }
}
