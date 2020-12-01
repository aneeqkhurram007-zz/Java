public class people {

    String title;
    String passPort;
    String BookingDate;
    String departureDate;
    String source;
    String destination;
    String ticket;
    String id;

    public people(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "title: " + title + "\nId: " + id + "\nPassport: " + passPort + "\nDate Of Departure: " + departureDate
                + "\nDate of Booking: " + BookingDate + "\nSource Airport: " + source + "\nDestination Airport: "
                + destination + "\nTicket Type: " + ticket;
    }
}
