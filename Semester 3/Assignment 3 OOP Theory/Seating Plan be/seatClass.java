import java.util.*;

public class seatClass {
    static ArrayList<seatClass> seatClasses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    ArrayList<people> peopleArray;

    static {
        String id;

        for (int i = 0; i < 10; i++) {
            ArrayList<people> peopleArrayList = new ArrayList<>();

            for (int j = 0; j < 4; j++) {
                char newChar;
                if (j == 0) {
                    newChar = 'A';
                } else if (j == 1) {
                    newChar = 'B';
                } else if (j == 2) {
                    newChar = 'C';
                } else {
                    newChar = 'D';
                }
                id = Integer.toString(i + 1) + (newChar);
                peopleArrayList.add(new people(id));

            }
            seatClasses.add(new seatClass(peopleArrayList));
        }

    }

    public seatClass(ArrayList<people> people) {
        peopleArray = people;
    }

    public ArrayList<people> getPeopleArrayList() {
        return peopleArray;
    }

    public static void main(String[] args) {
        char option;
        String option1;


        do {
            System.out.println("Press a for seat plan");
            System.out.println("Press b for seat reservation");
            System.out.println("Press c for seat cancellation");
            System.out.println("Press d for available seats");
            System.out.println("Press e for reserved seats");
            System.out.println("Press f for search seat");
            System.out.println("Enter your option: ");
            option = scanner.nextLine().charAt(0);

            if (option == 'a') {
                seatClass.seatPlan();
            } else if (option == 'b') {
                seatClass.seatReserve();
            } else if (option == 'c') {
                seatClass.seatCancellation();
            } else if (option == 'd') {
                seatClass.seatsAvailable();
            } else if (option == 'e') {
                seatClass.seatsReserved();
            } else if (option == 'f') {
                seatClass.searchSeat();
            }

            System.out.println("\nDo you want to continue: ");
            option1 = scanner.nextLine();

        } while (option1.equals("y"));

        scanner.close();
    }

    static void seatPlan() {
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + (i + 1) + " ");
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print(" A");
                } else if (j == 1) {
                    System.out.print(" B");
                } else if (j == 2) {
                    System.out.print(" C");
                } else {
                    System.out.print(" D");
                }
            }

        }

    }

    static void seatReserve() {


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your passport: ");
        String passPort = scanner.nextLine();

        System.out.println("Enter date of booking: ");
        String dataOfBooking = scanner.nextLine();

        System.out.println("Enter departure date: ");
        String departureDate = scanner.nextLine();

        System.out.println("Enter source Airport: ");
        String source = scanner.nextLine();

        System.out.println("Enter destination Airport: ");
        String destination = scanner.nextLine();

        System.out.println("Enter ticket type: ");
        String ticketType = scanner.nextLine();

        System.out.println("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }
        for (int i = 0; i < 4; i++) {
            if (seatClasses.get(seatRow).getPeopleArrayList().get(i).id.equals(seatNumber)) {
                seatClasses.get(seatRow).getPeopleArrayList().get(i).name = name;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).passPort = passPort;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).dataOfBooking = dataOfBooking;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).departureDate = departureDate;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).source = source;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).destination = destination;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).ticketType = ticketType;

                System.out.println("Seat has been reserved");
            }
        }


    }

    static void seatCancellation() {
        System.out.println("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }
        for (int i = 0; i < 4; i++) {
            if (seatClasses.get(seatRow).getPeopleArrayList().get(i).id.equals(seatNumber)) {
                seatClasses.get(seatRow).getPeopleArrayList().get(i).name = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).passPort = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).dataOfBooking = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).departureDate = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).source = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).destination = null;
                seatClasses.get(seatRow).getPeopleArrayList().get(i).ticketType = null;

                System.out.println("Seat has been cancelled");
            }
        }

    }

    static void seatsAvailable() {
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + (i + 1) + "  ");
            for (int j = 0; j < 4; j++) {
                if (seatClasses.get(i).getPeopleArrayList().get(j).name == null) {
                    if (i == 9) {
                        if (j == 0) {
                            System.out.print("A ");
                        } else if (j == 1) {
                            System.out.print("B ");
                        } else if (j == 2) {
                            System.out.print("C ");
                        } else {
                            System.out.print("D ");
                        }
                    } else {
                        System.out.print(seatClasses.get(i).getPeopleArrayList().get(j).id.charAt(1) + " ");
                    }
                } else {
                    System.out.print("X" + " ");
                }
            }
        }
    }

    static void seatsReserved() {
        for (int i = 0; i < 10; i++) {
            System.out.print("\n" + (i + 1) + "  ");
            for (int j = 0; j < 4; j++) {
                if (seatClasses.get(i).getPeopleArrayList().get(j).name != null) {
                    System.out.print(seatClasses.get(i).getPeopleArrayList().get(j).id.charAt(1) + " ");
                } else {
                    System.out.print("X" + " ");
                }
            }
        }
    }

    static void searchSeat() {
        System.out.println("Enter seat number: ");
        String seatNumber = scanner.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }

        for (int i = 0; i < 4; i++) {
            if (seatClasses.get(seatRow).getPeopleArrayList().get(i).id.equals(seatNumber)) {
                if (seatClasses.get(seatRow).getPeopleArrayList().get(i).name != null) {
                    System.out.println(seatClasses.get(seatRow).getPeopleArrayList().get(i));
                }
            }
        }

    }
}


class people {

    String name;
    String passPort;
    String dataOfBooking;
    String departureDate;
    String source;
    String destination;
    String ticketType;
    String id;


    public people(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nId: " + id +
                "\nPassport: " + passPort +
                "\nDate Of Departure: " + departureDate +
                "\nDate of Booking: " + dataOfBooking +
                "\nSource Airport: " + source +
                "\nDestination Airport: " + destination +
                "\nTicket Type: " + ticketType;
    }
}