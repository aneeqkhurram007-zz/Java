public class Student {
    private String name;
    private String email;
    private int cnic;
    private Course course1;
    private Course course2;
    private Address address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCnic() {
        return this.cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public Course getCourse1() {
        return this.course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return this.course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(int cnic, String name, Address address) {
        this.cnic = cnic;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("\n\tStudent Data:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Cnic: " + cnic);
        System.out.println("Address: " + address);
        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
    }
}
