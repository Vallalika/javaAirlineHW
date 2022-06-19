package javaAir;

import airlineStaff.CabinCrewMember;
import airlineStaff.Pilot;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private ArrayList<Integer> availableSeatNumbers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeatNumbers = generateAvailableSeatNumbers();
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

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public ArrayList<Integer> getAvailableSeatNumbers() {
        return this.availableSeatNumbers;
    }

    public int getAvailableSeats() {
        if (!isFull()) {
            int planeCapacity = this.getPlane().getMaxCapacity();
            int numberOfPassengers = this.getPassengers().size();
            int numberOfSeatsAvailable = planeCapacity - numberOfPassengers;
            return numberOfSeatsAvailable;
        } else {
            return 0;
        }
    }

    public String bookPassenger(Passenger passenger) {
        if (!this.isFull()) {
            this.passengers.add(passenger);
            passenger.setFlight(this);
            passenger.setSeat(this.generateSeat());

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

    public ArrayList generateAvailableSeatNumbers() {
        ArrayList generatedSeats = new ArrayList();
        int totalNumberOfSeats = this.plane.getMaxCapacity();
        for (int newSeat = 1; newSeat <= totalNumberOfSeats; newSeat++) {
            generatedSeats.add(newSeat);
        }
        return generatedSeats;
    }

    public Integer generateSeat() {
        int randomIndex;
        int generatedSeat;

        // Create instance of random generator
        Random indexGenerator = new Random();

        // Generate random index from seat arrayList
        randomIndex = indexGenerator.nextInt(this.getAvailableSeatNumbers().size());

        // Get seat number from arrayList using random index
        generatedSeat = new Integer(this.getAvailableSeatNumbers().get(randomIndex));

        // Delete seat number from list
        this.availableSeatNumbers.remove(randomIndex);

        return generatedSeat;
    }
}