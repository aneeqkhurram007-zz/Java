import java.io.*;
import java.time.*;
import java.util.*;

public class SeatPlan {
    private static final Scanner dateInput = new Scanner(System.in);
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static final ArrayList<SeatPlan> seatPlans = new ArrayList<>();
    private ArrayList<Person> person;

    public SeatPlan(ArrayList<Person> person) {
        setPerson(person);
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public static void showSeatPlan() {
        for (int i = 0; i < 10; i++) {
            System.out.print((i) + "\t");
            for (int j = 0; j < 4; j++) {
                switchCases(j);
            }
            System.out.println();
        }

    }

    public static void SeatPlans() {

        for (int i = 0; i < 10; i++) {

            seatPlans.add(new SeatPlan(person(i)));

        }

    }

    private static ArrayList<Person> person(int v) {
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
            String newS = Integer.toString(v);
            person.add(new Person(newS + Id));
        }

        return person;
    }

    public static void seatReservation(String id) throws NumberFormatException, IOException {

        char temp = id.charAt(0);
        int index = Integer.parseInt(String.valueOf(temp));

        if (seatPlans.get(index).getPerson().get(indexSearch(id)).getCnic() == null) {

            System.out.println("\nYou can register");
            personRegister(id, index);

        } else {
            System.out.println("\nAlready Registered");
        }

    }

    private static int indexSearch(String id) {

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

            System.out.println("\nAlready empty");

        } else {
            seatPlans.get(index).getPerson().get(indexSearch(id)).setNull();
            System.out.println("\nSeat has been cancelled");
        }

    }

    public static void availableSeats() {
        for (int i = 0; i < seatPlans.size(); i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 4; j++) {
                if (seatPlans.get(i).getPerson().get(j).getCnic() != null) {
                    System.out.print("X" + " ");
                } else {
                    switchCases(j);
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
                    switchCases(j);
                }
            }
            System.out.println();
        }
    }

    public static void searchReservation(String id) throws Exception {

        try {
            ObjectInputStream reader = new ObjectInputStream(new FileInputStream("data.ser"));

            while (true) {
                Person person = (Person) reader.readObject();
                for (int i = 0; i < 4; i++) {
                    if (person.getId().equals(id)) {
                        System.out.println(person);

                    }
                }
            }

        } catch (EOFException e) {
            System.out.println("No more records found.");
        } catch (Exception e) {
            System.out.println(e);
        }
        // char temp = id.charAt(0);
        // int index = Integer.parseInt(String.valueOf(temp));

        // System.out.println(seatPlan.get(index).getPerson().get(indexSearch(id)));

    }

    private static void personRegister(String id, int index) throws NumberFormatException, IOException {

        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("data.ser", true));

        // Name With Validation
        String name;

        System.out.print("\nEnter your name : ");

        name = input.readLine();
        while (!(name.matches("^[A-Z]{1}[a-zA-Z ]+$"))) {
            System.err.println("\nTry Again. Name can have only alphabets\nFirst Letter should be capital.");
            name = input.readLine();

        }

        // Cnic With Validation
        System.out.print("\nEnter your cnic: ");
        String cnic = input.readLine();
        cnic = checkCnic(cnic);

        while (!cnic.matches("[0-9]{5}[-]{1}[0-9]{7}[-]{1}[0-9]{1}+")) {
            System.err.println("Try Again. Cnic must be a number (XXXXX-XXXXXXX-X).");
            cnic = input.readLine();
            cnic = checkCnic(cnic);

        }

        // Date Of Travel
        System.out.println("\nEnter your date of travel (YYYY-MM-DD)");
        LocalDate dateOfTravel = LocalDate.of(dateInput.nextInt(), dateInput.nextInt(), dateInput.nextInt());

        // Source and Destination Selection
        int choice;
        String sourceAirport = null;
        String destinAirport = null;

        System.out.println("\nChoose your source Airport");
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

        // Ticket Choice
        String wayOfTravel = null;

        System.out.println("\nChoose your ticket type");
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

        // Date Of Booking

        LocalDateTime dateOfBooking = LocalDateTime.now();

        // addPerson method in Person Class
        seatPlans.get(index).getPerson().get(indexSearch(id)).addPerson(name, cnic, dateOfTravel, sourceAirport,
                destinAirport, wayOfTravel, dateOfBooking);

        try {

            writer.writeObject(seatPlans.get(index).getPerson().get(indexSearch(id)));
        } catch (Exception e) {
            System.out.println("Error in adding entry");
            e.printStackTrace();
            System.err.println(e);
        }

        writer.close();
    }

    private static String checkCnic(String cnic) throws IOException {

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
                    System.out.println("Two persons cannot have same cnic. ");
                    System.out.print("Try Again: ");
                    cnic = input.readLine();

                    break;
                }
            }

        } while (flag == 1);
        return cnic;
    }

    private static void switchCases(int j) {
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
