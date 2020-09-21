import java.text.DecimalFormat;

//package onlineLab1;

public class lab2 {

    public static void main(String[] args) {
        int i = 1;
        int count = 1;
        float pie, sum = 0;
        while (i <= 99) {

            if (count % 2 == 0) {
                sum = sum - 1 / (float) i;
            }
            if (count % 2 != 0) {
                sum = sum + 1 / (float) i;
            }
            i += 2;
            count++;
        }

        System.out.println("\n" + sum);

        pie = 4 * sum;
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        System.out.println("\nThe value of pi is: " + decimalFormat.format(pie));
    }

}