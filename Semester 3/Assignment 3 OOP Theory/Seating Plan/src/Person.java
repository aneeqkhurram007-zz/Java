import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Person {
    private String name;
    private String cnic;
    private LocalDate dateOfTravel;
    private String sourceAirport;
    private String destinAirport;
    private String wayOfTravel;
    private LocalDateTime dateOfBooking;
    private String Id;
    private Scanner input = new Scanner(System.in);

    public Person(String name, String cnic, String Id) {
        setName(name);
        setCnic(cnic);
        setId(Id);
    }

    public void addPerson(String name, String cnic, LocalDate dateOfTravel, String sourceAirport, String destinAirport,
            String wayOfTravel, LocalDateTime dateOfBooking) {

        setCnic(cnic);
        setName(name);
        setDateOfTravel(dateOfTravel);
        setSourceAirport(sourceAirport);
        setDestinAirport(destinAirport);
        setWayOfTravel(wayOfTravel);
        setDateOfBooking(dateOfBooking);

    }

    public void setNull() {
        setCnic(null);
        setName(null);
        setDateOfTravel(null);
        setSourceAirport(null);
        setDestinAirport(null);
        setWayOfTravel(null);
        setDateOfBooking(null);
    }

    public Person(String id) {
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getCnic() {

        return cnic;
    }

    public void setCnic(String cnic) {

        this.cnic = cnic;

    }

    public LocalDate getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(LocalDate dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public String getSourceAirport() {
        return sourceAirport;
    }

    public void setSourceAirport(String sourceAirport) {
        this.sourceAirport = sourceAirport;
    }

    public String getDestinAirport() {
        return destinAirport;
    }

    public void setDestinAirport(String destinAirport) {
        this.destinAirport = destinAirport;
    }

    public String getWayOfTravel() {
        return wayOfTravel;
    }

    public void setWayOfTravel(String wayOfTravel) {
        this.wayOfTravel = wayOfTravel;
    }

    public LocalDateTime getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(LocalDateTime dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "\tPerson Id = " + Id + "\n Name = " + name + "\n Cnic = " + cnic + "\n Date of Booking = "
                + dateOfBooking + "\n Date of Travel = " + dateOfTravel + "\n Destination = " + destinAirport
                + "\n Source = " + sourceAirport + "\n Ticket = " + wayOfTravel;
    }

}
