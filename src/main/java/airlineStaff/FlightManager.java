package airlineStaff;

import javaAir.Flight;
import javaAir.Passenger;

public class FlightManager extends AirlineStaff {
    public FlightManager(String name, Rank rank) {
        super(name, rank);
    }

    public int calculateFlightBaggageAllowance(Flight flight) {
        double baggageAllowancePerFlight = flight.getPlane().getMaxWeight()/2;
        double baggageWeightPerPassenger = baggageAllowancePerFlight / flight.getPlane().getMaxCapacity();
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
