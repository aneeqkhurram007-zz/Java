
/**
 * ass5
 */
import java.util.*;

public class ass5 {

    public static void main(String[] args) {
        int size1, size2;
        Scanner size = new Scanner(System.in);
        int[] array1;
        System.out.println("\nEnter size for 1st array: ");
        size1 = size.nextInt();
        System.out.println("\nArray 1: ");
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter " + (i + 1) + " of array 1: ");
            array1[i] = size.nextInt();
        }
        System.out.println("\nEnter size for 2nd array: ");
        size2 = size.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter " + (i + 1) + " of 2nd array: ");
            array2[i] = size.nextInt();
        }
        int newSize = size1 + size2;
        int[] newArray = new int[newSize];
        merge(array1, size1, array2, size2, newArray, newSize);

        size.close();

    }

    private static void merge(int[] array1, int size1, int[] array2, int size2, int[] newArray, int newSize) {
        int i, j, k;
        for (i = 0; i < size1; i++) {
            newArray[i] = array1[i];
        }
        for (j = 0; j < size2; j++, i++) {
            newArray[i] = array2[j];
        }
        for (i = 0; i < newSize; i++) {
            for (j = i + 1; j < newSize;) {
                if (newArray[j] == newArray[i]) {
                    for (k = j; k < newSize; k++) {
                        newArray[k] = newArray[k + 1];
                    }
                    newSize--;
                } else {
                    j++;
                }
            }
        }
        // Bubble Sort
        int temp;
        for (i = 0; i < newSize; i++) {
            for (j = 0; j < newSize; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        System.out.println("\nArray 3:\n ");
        for (i = 0; i < newSize; i++) {
            System.out.println(newArray[i] + " ");
        }
    }
}