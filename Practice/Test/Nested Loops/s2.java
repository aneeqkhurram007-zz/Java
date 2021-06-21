public class s2 {
    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 1, 4 };
        int num = 9;
        sumOfPairs(num, arr);
    }

    static void sumOfPairs(int num, int[] arr) {

        int i = 0;
        int sum = 0;
        while (i < 10) {
            int j = 0;

            while (j < 10) {
                sum = arr[i];
                sum = sum + arr[j];
                if (sum == 9) {
                    System.out.println("Sum of elements: " + arr[i] + "+" + arr[j] + " = " + sum);
                }
                j++;
            }
            i++;
        }
    }
}
