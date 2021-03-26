public class star3 {
    public static void main(String[] args) {
        int cx = 0;
        int x = 1;
        while (cx < 5) {
            int space = 4 - cx;
            while (space >= 0) {
                System.out.print(' ');
                space--;
            }
            int dl = cx + x;
            int b = 0;
            while (b < dl) {
                System.out.print('*');
                b++;
            }
            System.out.println();
            cx++;
            x++;
        }
    }
}
