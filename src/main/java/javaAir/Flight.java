package javaAir;

import airlineStaff.CabinCrewMember;
import airlineStaff.Pilot;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return this.cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public int getAvailableSeats() {
        if (!isFull()) {
            int planeCapacity = this.getPlane().getMaxCapacity();
            int numberOfPassengers = this.getPassengers().size();
            int numberOfSeatsAvailable = planeCapacity - numberOfPassengers;
            return numberOfSeatsAvailable;
        } else{
            return 0;
        }
        }

    public String bookPassenger(Passenger passenger) {
        if (!this.isFull()) {
            this.passengers.add(passenger);
            return "javaAir.Passenger "+passenger.getName()+" is now booked on flight "+this.flightNumber;
        } else {
            return "Could not book passenger "+passenger.getName()+" on flight "+this.flightNumber+". This flight is full.";
        }
    }

    public boolean isFull() {
        if (this.passengers.size() == this.getPlane().getMaxCapacity()) {
            return true;
        } else {
            return false;
        }
    }
}