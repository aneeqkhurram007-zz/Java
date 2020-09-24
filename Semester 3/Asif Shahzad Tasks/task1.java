public class task1 {
    public static void main(String[] args) {
        // Initialize a variable n with some +ve integer value.
        // Then create implement logic to print first n prime numbers on console.
        int n = 5;
        System.out.println("Value of Initialized variable = " + n);
        // Prime Numbers Logic
        for (int i = 2; i <= n; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;

                }
            }
            if (flag == true) {
                System.out.println(i);
            }

        }
    }
}