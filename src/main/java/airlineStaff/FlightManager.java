package airlineStaff;

import javaAir.Flight;

public class FlightManager extends AirlineStaff {
    public FlightManager(String name, Rank rank) {
        super(name, rank);
    }

    public int getBaggageWeightPerPassenger(Flight flight) {
        double baggageAllowancePerFlight = flight.getPlane().getMaxWeight()/2;
        double baggageWeightPerPassenger = baggageAllowancePerFlight / flight.getPlane().getMaxCapacity();
        return (int) Math.floor(baggageWeightPerPassenger);
    }
}
