package javaAir;

public class Passenger {

    private String name;
    private int bagNumber;
    private Flight flight;

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return bagNumber;
    }

    public Passenger(String name, int bagNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
        this.flight = null;

    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
