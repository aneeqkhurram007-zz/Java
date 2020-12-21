public class Test {
    public static void main(String[] args) throws SomeClass {
        try {
            SomeClass.someMethod();

        } catch (ArithmeticException e) {
            System.out.println("Error Caught");
            e.printStackTrace();
        }
        System.out.println("Program is running");
    }
}
