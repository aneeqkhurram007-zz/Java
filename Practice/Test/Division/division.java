/**
 * division
 */
public class division {

    public static void main(String[] args) {
        int total = 240;
        int temp = 0;
        int rTotal = 0;
        while (total > 0) {
            rTotal = total;
            int count = 0;

            while (rTotal > 10) {
                rTotal /= 10;
                count++;
                temp = 10 * count * 10;
            }
            System.out.println(rTotal);
            System.out.println(temp);
            total -= temp;
            System.out.println(total);
            System.out.println("NEW");

        }
        if (total < 0) {

        }

    }
}