import java.io.*;
import java.time.*;
import java.util.*;

public class SeatPlan {
    private static Scanner dateInput = new Scanner(System.in);
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<SeatPlan> seatPlans = new ArrayList<>();
    private ArrayList<Person> person;
    private int num;

    public SeatPlan(ArrayList<Person> person, int num) {
        setPerson(person);
        setNum(num);
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static void showSeatPlan() {
        for (int i = 0; i < 10; i++) {
            System.out.print((i) + "\t");
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:

                        System.out.print("A" + " ");
                        break;
                    case 1:
                        System.out.print("B" + " ");

                        break;
                    case 2:
                        System.out.print("C" + " ");

                        break;
                    case 3:
                        System.out.print("D" + " ");

                        break;

                    default:
                        break;
                }
            }
            System.out.println();
        }

    }

    public static void SeatPlans() {

        for (int i = 0; i < 10; i++) {

            seatPlans.add(new SeatPlan(person(i), i));

        }

    }

    public static ArrayList<Person> person(int v) {
        String Id = null;
        ArrayList<Person> person = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            switch (i) {
                case 0:
                    Id = "A";
                    break;
                case 1:
                    Id = "B";

                    break;
                case 2:
                    Id = "C";

                    break;
                case 3:
                    Id = "D";

                    break;

                default:
                    break;
            }
            person.add(new Person(Integer.toString(v) + Id));
        }

        return person;
    }

    public static void seatReservation(String id) throws NumberFormatException, IOException {

        char temp = id.charAt(0);
        int index = Integer.parseInt(String.valueOf(temp));

        if (seatPlans.get(index).getPerson().get(indexSearch(id)).getCnic() == null) {

            System.out.println("Yes You can register");
            personRegister(id, index);

        } else {
            System.out.println("Already Registered");
        }

    }

    public static int indexSearch(String id) {

        switch (id.charAt(1)) {
            case 'A':

                return 0;
            case 'B':

                return 1;
            case 'C':

                return 2;
            case 'D':

                return 3;
            default:
                return -1;
        }
    }

    public static void seatCancellation(String id) {

        char temp = id.charAt(0);
        int index = Integer.parseInt(String.valueOf(temp));

        if (seatPlans.get(index).getPerson().get(indexSearch(id)).getCnic() == null) {

            System.out.println("Already empty");

        } else {
            seatPlans.get(index).getPerson().get(indexSearch(id)).setNull();
            System.out.println("Seat has been cancelled");
        }

    }

    public static void availableSeats() {
        for (int i = 0; i < seatPlans.size(); i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 4; j++) {
                if (seatPlans.get(i).getPerson().get(j).getCnic() != null) {
                    System.out.print("X" + " ");
                } else {
                    switch (j) {
                        case 0:

                            System.out.print("A" + " ");
                            break;
                        case 1:
                            System.out.print("B" + " ");

                            break;
                        case 2:
                            System.out.print("C" + " ");

                            break;
                        case 3:
                            System.out.print("D" + " ");

                            break;

                        default:
                            break;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void reservedSeats() {
        for (int i = 0; i < seatPlans.size(); i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 4; j++) {
                if (seatPlans.get(i).getPerson().get(j).getCnic() == null) {
                    System.out.print("X" + " ");
                } else {
                    switch (j) {
                        case 0:

                            System.out.print("A" + " ");
                            break;
                        case 1:
                            System.out.print("B" + " ");

                            break;
                        case 2:
                            System.out.print("C" + " ");

                            break;
                        case 3:
                            System.out.print("D" + " ");

                            break;

                        default:
                            break;
                    }
                }
            }
            System.out.println();
        }
    }

    public static void searchReservation(String id) {

        char temp = id.charAt(0);
        int index = Integer.parseInt(String.valueOf(temp));

        System.out.println(seatPlans.get(index).getPerson().get(indexSearch(id)));

    }

    public static void personRegister(String id, int index) throws NumberFormatException, IOException {

        String name;

        System.out.print("Enter your name : ");

        name = input.readLine();
        while (!(name.matches("^[a-zA-Z]*$") && name.charAt(0) >= 65 && name.charAt(0) <= 90)) {
            System.err.println("Try Again. Name can have only alphabets and First Letter should be capital.");
            name = input.readLine();

        }

        System.out.print("Enter your cnic: ");
        String cnic = input.readLine();
        cnic = checkCnic(cnic);

        while (!cnic.matches("[0-9]+")) {
            System.err.println("Try Again. Cnic must be a number.");
            cnic = input.readLine();
        }

        System.out.println("Enter your date of travel (YYYY-MM-DD)");
        LocalDate dateOfTravel = LocalDate.of(dateInput.nextInt(), dateInput.nextInt(), dateInput.nextInt());

        int choice;
        String sourceAirport = null;
        String destinAirport = null;

        System.out.println("Choose your source Airport");
        System.out.println("Press 1 for LHR");
        System.out.println("Press 2 for KHI");
        do {
            choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    sourceAirport = "Lahore";
                    destinAirport = "Karachi";
                    break;
                case 2:
                    sourceAirport = "Karachi";
                    destinAirport = "Lahore";
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.print("Try Again: ");

                    break;
            }
        } while (choice != 1 && choice != 2);

        String wayOfTravel = null;

        System.out.println("Choose your ticket type");
        System.out.println("Press 1 for One-Way");
        System.out.println("Press 2 for Return");
        do {
            choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1:
                    wayOfTravel = "One-Way";
                    break;
                case 2:
                    wayOfTravel = "Return";
                    break;
                default:
                    System.out.println("Invalid Input");
                    System.out.print("Try Again: ");
                    break;
            }
        } while (choice != 1 && choice != 2);

        LocalDateTime dateOfBooking = LocalDateTime.now();

        seatPlans.get(index).getPerson().get(indexSearch(id)).addPerson(name, cnic, dateOfTravel, sourceAirport,
                destinAirport, wayOfTravel, dateOfBooking);

    }

    public static String checkCnic(String cnic) throws IOException {

        int flag;
        do {

            flag = 0;

            for (int i = 0; i < seatPlans.size(); i++) {
                for (int j = 0; j < seatPlans.get(i).getPerson().size(); j++) {

                    if (cnic.equals(seatPlans.get(i).getPerson().get(j).getCnic())) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Two persons cannot have same cnic. ");
                System.out.print("Try Again: ");
                cnic = input.readLine();
            }
        } while (flag == 1);
        return cnic;
    }

}
