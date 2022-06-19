package javaAir;

public class Passenger {

    private String name;
    private int bagNumber;
    private Flight flight;
    private Integer seat;

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
        this.seat = null;

    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getSeat() {
        return this.seat;
    }

    public void setSeat(Integer seatNumber) {
        this.seat = seatNumber;
    }
}