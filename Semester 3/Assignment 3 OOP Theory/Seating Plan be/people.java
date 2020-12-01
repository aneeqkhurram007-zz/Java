public class people {

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
