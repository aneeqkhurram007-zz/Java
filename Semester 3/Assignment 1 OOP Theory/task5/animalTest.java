package task5;

public class animalTest {
    public static void main(String[] args) {
        animal a1 = new animal("Tiger", 1500, 3.4);
        animal a2 = new animal("Snake", 1000, 5.6);
        animal a3 = new animal("Mouse", 124, -1.6);
        animal a4 = new animal("Monkey", 100, -4.8);
        animal a5 = new animal("tiger", 10, 8.6);
        System.out.println(a1);
        System.out.println(a5);
        System.out.println(a1.isEquals(a5));
        System.out.println(a4.endangered());

    }
}
