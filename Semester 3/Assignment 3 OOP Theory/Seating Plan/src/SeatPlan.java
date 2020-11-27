import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class SeatPlan {
    private static ArrayList<SeatPlan> seatPlans = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);
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

    public static void seatReservation(String id) {

        char temp = id.charAt(0);
        int index = Integer.parseInt(String.valueOf(temp));

        if (seatPlans.get(index).getPerson().get(indexSearch(id)).getCnic() == null) {

            System.out.println("Yes You can register");
            // seatPlans.get(index).getPerson().get(indexSearch(id)).setCnic("35201");
            personRegister(id, index);

        } else {
            System.out.println("Already Registered");
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

    public static void personRegister(String id, int index) {
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.print("Enter your cnic: ");
        String cnic = input.nextLine();

        LocalDate dateOfTravel = LocalDate.now();

        System.out.print("Enter your source Airport: ");
        String sourceAirport = input.nextLine();

        System.out.print("Enter your destin Airport: ");
        String destinAirport = input.nextLine();

        System.out.print("Enter your ticket type: ");
        String wayOfTravel = input.nextLine();

        LocalDateTime dateOfBooking = LocalDateTime.now();

        seatPlans.get(index).getPerson().get(indexSearch(id)).addPerson(name, cnic, dateOfTravel, sourceAirport,
                destinAirport, wayOfTravel, dateOfBooking);

        System.out.println("Your Booking");

        System.out.println(seatPlans.get(index).getPerson().get(indexSearch(id)));

    }

    public static void SeatPlans() {

        for (int i = 0; i < 10; i++) {

            seatPlans.add(new SeatPlan(person(i), i));

            /*
             * System.out.print(seatPlans.get(i).getNum() + "\t");
             * 
             * for (Person person : person(i)) { System.out.print(person.getId().charAt(1) +
             * " "); } System.out.println();
             */
        }
        // seatPlans = seatPlansL;

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

}
