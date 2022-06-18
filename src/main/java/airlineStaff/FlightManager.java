package airlineStaff;

import javaAir.Flight;
import javaAir.Passenger;

public class FlightManager extends AirlineStaff {
    public FlightManager(String name, Rank rank) {
        super(name, rank);
    }

    public double calculateBaggageAllowancePerFlight(Flight flight) {
        double baggageAllowancePerFlight = flight.getPlane().getMaxWeight()/2;
        return baggageAllowancePerFlight;
    }

    public int calculateBaggageAllowancePerPassenger(Flight flight) {
        double baggageWeightPerPassenger = calculateBaggageAllowancePerFlight(flight) / flight.getPlane().getMaxCapacity();
        return (int) Math.floor(baggageWeightPerPassenger);
    }

    public int calculateTotalBaggageBookedPerFlight(Flight flight) {
        int totalBaggageWeight = 0;
        for (Passenger passenger: flight.getPassengers()) {
            totalBaggageWeight += passenger.getNumberOfBags();
        }
        return totalBaggageWeight*10;
    }
}
