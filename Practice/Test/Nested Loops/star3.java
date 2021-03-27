public class star3 {
    public static void main(String[] args) {
        // int cx = 0;
        // int x = 1;
        // while (cx < 5) {
        // int space = 4 - cx;
        // while (space >= 0) {
        // System.out.print(' ');
        // space--;
        // }
        // int total = cx + x;
        // int bx = 0;
        // while (bx < total) {
        // System.out.print('*');
        // bx++;
        // }
        // System.out.println();
        // cx++;
        // x++;
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
