import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main Program");
        int num = 0;
        boolean confirm = true;
        String name = null;
        do {
            try {
                try {
                    // Exception A
                    System.out.println("Throwing Exception A");
                    throwExceptionA(5, /* rand.nextInt(1) */num);
                } catch (ExceptionB e) {
                    e.printStackTrace();
                }
                try {
                    // Exception B
                    System.out.println("Throwing Exception B");
                    throwExceptionb(5, /* rand.nextInt(1) */(num - 1));
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
                try {
                    // Null pointer exception
                    if (name == null) {
                        name = "Aneeq";
                        throw new NullPointerException("It cannot be null");
                    } else {
                        System.out.println("Null pointer executed successfully");
                    }

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                try {
                    confirm = false;
                    throw new IOException("IO exception Bawa G");
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                System.out.println("Exception Caught" + e.getClass());
                e.printStackTrace();
            }
            num++;
        } while (confirm);
    }

    public static double throwExceptionA(int a, int b) throws ExceptionA {
        System.out.println("Exception A");
        if (b == 0) {
            throw new ExceptionA("It cannot be zero");
        } else {
            System.out.println("Exception A successfully executed");

            return a / b;
        }
    }

    public static double throwExceptionb(int a, int b) throws ExceptionB {
        System.out.println("Exception B");
        if (b == 0) {
            throw new ExceptionB("It cannot be zero");
        } else {
            System.out.println("Exception B successfully executed");
            return a / b;
        }

    }
}
