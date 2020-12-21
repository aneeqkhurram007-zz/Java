
public class Test {

    public static void main(String[] args) throws ExceptionC {
        String name = args[0];
        System.out.println(name);
        try {
            int num = Integer.parseInt(args[1]);
            System.out.println(num);
            // input.close();
            if (num <= 0) {
                throw new ExceptionC("2 cannot be less than 0");
            }
        } catch (ExceptionA e) {
            System.out.println("Exception A running");
            e.printStackTrace();
        }
        try {
            System.out.println("Dividing");
            double result = divide(5, 6);
            System.out.printf("%.5f\n", result);

        } catch (ExceptionA e) {
            e.printStackTrace();
        }
    }

    public static double divide(int a, int b) throws ExceptionB {
        if (b == 0) {
            throw new ExceptionB("Cannot Divide by 0");
        } else {
            return a / b;
        }
    }
}