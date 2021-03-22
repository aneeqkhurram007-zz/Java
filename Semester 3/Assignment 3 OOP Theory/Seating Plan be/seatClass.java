import java.util.*;

public class seatClass {
    static ArrayList<seatClass> seatsInPlane = new ArrayList<>();
    static Scanner enter = new Scanner(System.in);
    ArrayList<people> peoples;

    static {
        String id;

        for (int i = 0; i < 5; i++) {
            ArrayList<people> peoplesList = new ArrayList<>();

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
                peoplesList.add(new people(id));

            }
            seatsInPlane.add(new seatClass(peoplesList));
        }

    }

    public seatClass(ArrayList<people> people) {
        peoples = people;
    }

    public ArrayList<people> getpeoplesList() {
        return peoples;
    }

    public static void seatPlan() {
        for (int i = 0; i < 5; i++) {
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

    public static void seatReserve() {

        System.out.println("Enter seat number: ");
        String seatNumber = enter.nextLine();

        System.out.println("Enter your title: ");
        String title = enter.nextLine();

        System.out.println("Enter your passport: ");
        String passPort = enter.nextLine();

        System.out.println("Enter date of booking: ");
        String BookingDate = enter.nextLine();

        System.out.println("Enter departure date: ");
        String departureDate = enter.nextLine();

        System.out.println("Enter source Airport: ");
        String source = enter.nextLine();

        System.out.println("Enter destination Airport: ");
        String destination = enter.nextLine();

        System.out.println("Enter ticket type: ");
        String ticket = enter.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }
        for (int i = 0; i < 4; i++) {
            if (seatsInPlane.get(seatRow).getpeoplesList().get(i).id.equals(seatNumber)) {
                seatsInPlane.get(seatRow).getpeoplesList().get(i).title = title;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).passPort = passPort;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).BookingDate = BookingDate;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).departureDate = departureDate;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).source = source;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).destination = destination;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).ticket = ticket;

                System.out.println(seatsInPlane.get(seatRow).getpeoplesList().get(i));
            }
        }

    }

    public static void seatCancellation() {
        System.out.println("Enter seat number: ");
        String seatNumber = enter.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }
        for (int i = 0; i < 4; i++) {
            if (seatsInPlane.get(seatRow).getpeoplesList().get(i).id.equals(seatNumber)) {
                seatsInPlane.get(seatRow).getpeoplesList().get(i).title = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).passPort = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).BookingDate = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).departureDate = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).source = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).destination = null;
                seatsInPlane.get(seatRow).getpeoplesList().get(i).ticket = null;

                System.out.println("Seat has been cancelled");
            }
        }

    }

    public static void seatsAvailable() {
        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + (i + 1) + "  ");
            for (int j = 0; j < 4; j++) {
                if (seatsInPlane.get(i).getpeoplesList().get(j).title == null) {
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
                        System.out.print(seatsInPlane.get(i).getpeoplesList().get(j).id.charAt(1) + " ");
                    }
                } else {
                    System.out.print("X" + " ");
                }
            }
        }
    }

    public static void seatsReserved() {
        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + (i + 1) + "  ");
            for (int j = 0; j < 4; j++) {
                if (seatsInPlane.get(i).getpeoplesList().get(j).title != null) {
                    System.out.print(seatsInPlane.get(i).getpeoplesList().get(j).id.charAt(1) + " ");
                } else {
                    System.out.print("X" + " ");
                }
            }
        }
    }

    public static void searchSeat() {
        System.out.println("Enter seat number: ");
        String seatNumber = enter.nextLine();

        int seatRow;
        if (seatNumber.charAt(1) == '0') {
            seatRow = 9;
        } else {
            seatRow = Character.getNumericValue(seatNumber.charAt(0)) - 1;
        }

        for (int i = 0; i < 4; i++) {
            if (seatsInPlane.get(seatRow).getpeoplesList().get(i).id.equals(seatNumber)) {
                if (seatsInPlane.get(seatRow).getpeoplesList().get(i).title != null) {
                    System.out.println(seatsInPlane.get(seatRow).getpeoplesList().get(i));
                }
            }
        }

    }
}
