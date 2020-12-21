/**
 * SomeClass
 */
public class SomeClass extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static void someMethod() throws ArithmeticException {

        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }

        
    }

    public static void someMethod2() throws ArithmeticException {
        throw new ArithmeticException();
    }

}