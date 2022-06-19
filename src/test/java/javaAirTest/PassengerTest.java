package javaAirTest;

import airlineStaff.CabinCrewMember;
import airlineStaff.FlightManager;
import airlineStaff.Pilot;
import airlineStaff.Rank;
import javaAir.Flight;
import javaAir.Passenger;
import javaAir.Plane;
import javaAir.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger passengerOne;
    Flight flight001;
    Pilot martynaThePilot;
    CabinCrewMember rachel;
    CabinCrewMember greg;
    CabinCrewMember simon;
    Plane myAwesomePlane;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Date departureTime;

    @Before
    public void before() {
        passengerOne = new Passenger("Mary", 1);
        martynaThePilot = new Pilot("Martyna", Rank.CAPTAIN, "OSS117");
        rachel = new CabinCrewMember("Rachel", Rank.FIRST_OFFICER);
        greg = new CabinCrewMember("Greg", Rank.PURSER);
        simon = new CabinCrewMember("Simon", Rank.FLIGHT_ATTENDANT);
        myAwesomePlane = new Plane(PlaneType.AIRBUS350);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(rachel);
        cabinCrewMembers.add(greg);
        cabinCrewMembers.add(simon);
        departureTime = new Date();
        flight001 = new Flight(martynaThePilot, cabinCrewMembers, myAwesomePlane, "FR756", "Paris", "EDI", departureTime);
    }

    @Test
    public void canGetName() {
        assertEquals("Mary",passengerOne.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(1,passengerOne.getNumberOfBags());
    }

    @Test
    public void startsWithNoFlight() {
        assertEquals(null,passengerOne.getFlight());
    }

    @Test
    public void canSetFlight(){
        passengerOne.setFlight(flight001);
        assertEquals(flight001,passengerOne.getFlight());
    }

    @Test
    public void startsWithNoSeat() {
        assertEquals(null,passengerOne.getSeat());
    }

    @Test
    public void canSetSeat() {
        Integer seatNumber = new Integer(27);
        passengerOne.setSeat(seatNumber);
        assertEquals(seatNumber,passengerOne.getSeat());
    }
}