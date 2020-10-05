package task4;

public class StudentMain {

    public static void main(String[] args) {

        Student st1 = new Student("Aneeq", "FA19-BCS-145", "BCS", "CS", 4.0);
        Student st2 = new Student("Danyal", "FA19-BCS-060", "BCS", "CS", 3.0);
        Student st3 = new Student("Saleem", "FA19-BCS-109", "BCS", "CS", 3.7);
        Student st4 = new Student("Saif", "FA19-BCS-112", "BCS", "CS", 3.5);
        Student st5 = new Student("Affan", "FA19-BCS-165", "BCS", "CS", 3.7);
        Student st6 = new Student("Wahab", "FA19-BCS-003", "BCS", "CS", 2.7);

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