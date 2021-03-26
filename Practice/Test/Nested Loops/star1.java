/**
 * star1
 */
public class star1 {

    public static void main(String[] args) {
        int cx = 0;
        while (cx < 5) {
            int bx = 0;
            while (bx <= cx) {
                System.out.print('*');
                bx++;
            }
            System.out.println();
            cx++;
        }
    }
}