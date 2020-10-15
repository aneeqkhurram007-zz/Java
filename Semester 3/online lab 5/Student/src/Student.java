
public class Student {
    private String name;
    private float marks;

    private static int passLimit = 33;
    static {
        System.out.println("Static Block with Marks Info: ");
        System.out.print("Enter your marks: ");

    }

    public static void updateStaticLimit(int limit) {
        passLimit = limit;
    }

    public boolean isPassed() {
        return marks > passLimit;
    }

    public Student(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(Student student) {
        this.name = student.name;
        this.marks = student.marks;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return this.marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public static void compare(Student std1, Student std2) {
        if (std1.marks > std2.marks) {
            System.out.println("Student 1 marks are greater than student 2 marks");
        } else if (std2.marks > std1.marks) {
            System.out.println("Student 2 marks are greater than student 1 marks");

        } else {
            System.out.println("Both marks are same");
        }
        System.out.println("Marks for Student 1: " + std1.marks + "\nMarks for Student 2: " + std2.marks);

    }

}
