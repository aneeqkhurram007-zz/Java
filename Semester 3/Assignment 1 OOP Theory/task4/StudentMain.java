package task4;

public class StudentMain {

    public static void main(String[] args) {

        Student st1 = new Student("A", "FA19-BCS-001", "BCS", "CS", 4.0);
        Student st2 = new Student("B", "FA19-BCS-002", "BCS", "CS", 3.0);
        Student st3 = new Student("C", "FA19-BCS-003", "BCS", "CS", 3.7);
        Student st4 = new Student("D", "FA19-BCS-004", "BCS", "CS", 3.5);
        Student st5 = new Student("E", "FA19-BCS-005", "BCS", "CS", 3.7);
        Student st6 = new Student("F", "FA19-BCS-006", "BCS", "CS", 2.7);

        switch (Student.compare(st1.cgpa, st2.cgpa, st3.cgpa, st4.cgpa, st5.cgpa, st6.cgpa)) {
            case 0:
                st1.show();
                break;
            case 1:
                st2.show();
                break;
            case 2:
                st3.show();

                break;
            case 3:
                st4.show();
                break;
            case 4:
                st5.show();
                break;
            case 5:
                st6.show();
                break;

            default:
                System.out.println("Record not found");
                break;
        }
    }
}