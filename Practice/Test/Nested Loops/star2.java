public class star2 {

    public static void main(String[] args) {
        int cx = 5;
        while (cx > 0) {
            int bx = 0;
            while (bx < cx) {
                System.out.print('*');
                bx++;
            }
            System.out.println();
            cx--;
        }
    }

}
