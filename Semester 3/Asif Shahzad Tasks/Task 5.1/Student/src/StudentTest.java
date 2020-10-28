public class StudentTest {
    public static void main(String[] args) {
        Course course = new Course("CSC 131", "Programming");

        PhoneNumber phoneNumber = new PhoneNumber(92, 306, 4730660);

        Address address = new Address("H#18", "Younas Pura", "Lahore", "Pakistan", phoneNumber);

        Student student1 = new Student(35201, "Aneeq", address);

        student1.setCourse1(course);
        student1.setEmail("aneeqkhurram007@gmail.com");
        student1.setCourse2(new Course("Isl 431", "Islamiyat"));
        student1.display();

        Student student2 = new Student(35202, "Murshad", address);
        student2.setCourse1(course);
        student2.setEmail("aneeqkhurram007@yahoo.com");
        student2.setCourse2(new Course("Isl 431", "Islamiyat"));
        student2.display();
    }
}
