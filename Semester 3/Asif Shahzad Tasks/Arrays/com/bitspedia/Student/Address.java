package com.bitspedia.Student;

public class Address {
    private String streetAddress;
    private String town;
    private String city;
    private String country;

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(String streetAddress, String town, String city, String country) {

        setStreetAddress(streetAddress);
        setTown(town);
        setCity(city);
        setCountry(country);

    }

    public String toString() {
        return streetAddress + "," + town + "," + city + "," + country;
    }

}
