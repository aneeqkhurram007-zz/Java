
/**
 * ass4
 */
import java.util.*;

public class ass4 {

    public static void main(String[] args) {
        System.out.println("\t__0__|__1__|__2__");
        System.out.println("\t__3__|__4__|__5__");
        System.out.println("\t  6  |  7  |  8  ");
        Scanner num = new Scanner(System.in);

        char[] array;
        array = new char[9];
        int position, flag1 = 0, flag2 = 0;
        System.out.println("\n'O' marks for player 1: ");
        System.out.println("\n'X' marks for player 2: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Player 1 turns: ");
                System.out.println("\nPosition you want to place your move: ");
                position = num.nextInt();
                if (array[position] == 0) {
                    array[position] = 'O';
                    flag1 = checkWin(array);
                    if (flag1 == 1) {
                        break;
                    }
                } else {
                    System.out.println("\nAlready filled Try Again.");
                    i--;
                }

            } else {
                System.out.println("Player 2 turns: ");
                System.out.println("\nPosition you want to place your move: ");
                position = num.nextInt();
                if (array[position] == 0) {
                    array[position] = 'X';
                    flag2 = checkWin(array);
                    if (flag2 == 1) {
                        break;
                    }
                } else {
                    System.out.println("\nAlready filled Try Again.");
                    i--;
                }

            }

        }
        if (flag1 == flag2) {
            System.out.println("Match Draw");

        }
        if (flag2 == 0 && flag1 == 1) {
            System.out.println("Player O wins");
        }
        if (flag1 == 0 && flag2 == 1) {
            System.out.println("Player X wins");
        }
        for (int i = 0, r = 0; r < 3; i += 3, r++) {
            if (r == 2) {
                System.out.println("\t  " + array[i] + "  |  " + array[i + 1] + "   |  " + array[i + 2]);
            } else {
                System.out.println("\t__" + array[i] + "__|__" + array[i + 1] + "__|__" + array[i + 2] + "__");
            }
        }
        num.close();

    }

    public static int checkWin(char array[]) {

        if (array[0] == array[1] && array[1] == array[2]) {
            if (array[0] != 0 && array[1] != 0 && array[2] != 0) {

                return 1;
            }
        } else if (array[3] == array[4] && array[4] == array[5]) {
            if (array[3] != 0 && array[4] != 0 && array[5] != 0) {

                return 1;
            }
        } else if (array[6] == array[7] && array[7] == array[8]) {
            if (array[6] != 0 && array[7] != 0 && array[8] != 0) {

                return 1;
            }
        } else if (array[0] == array[3] && array[3] == array[6]) {
            if (array[0] != 0 && array[3] != 0 && array[6] != 0) {

                return 1;
            }
        } else if (array[1] == array[4] && array[4] == array[7]) {
            if (array[1] != 0 && array[4] != 0 && array[7] != 0) {

                return 1;
            }
        } else if (array[2] == array[5] && array[5] == array[8]) {
            if (array[2] != 0 && array[5] != 0 && array[8] != 0) {

                return 1;
            }
        }

        else if (array[0] == array[4] && array[4] == array[8]) {
            if (array[0] != 0 && array[4] != 0 && array[8] != 0) {

                return 1;
            }
        } else if (array[2] == array[4] && array[4] == array[6]) {
            if (array[2] != 0 && array[4] != 0 && array[6] != 0) {

                return 1;
            }
        }
        return 0;
    }

}