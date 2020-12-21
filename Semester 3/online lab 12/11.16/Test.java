import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ExceptionC {
        try {
            int num;
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            input.close();
            if (num < 0) {
                throw new ExceptionC("2 cannot be less than 0");
            }
        } catch (ExceptionA e) {
            System.out.println("Exception A running");
            e.printStackTrace();
        }

    }
}