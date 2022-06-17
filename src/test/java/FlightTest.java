import airlineStaff.CabinCrewMember;
import airlineStaff.Pilot;
import airlineStaff.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight001;
    Flight flightTest;
    Pilot martynaThePilot;
    CabinCrewMember rachel;
    CabinCrewMember greg;
    CabinCrewMember simon;
    CabinCrewMember ant;
    CabinCrewMember rose;
    Plane myAwesomePlane;
    Plane planeTest;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Passenger passengerOne;
    Passenger passengerTwo;

    @Before
    public void before() {
        martynaThePilot = new Pilot("Martyna", Rank.CAPTAIN, "OSS117");
        rachel = new CabinCrewMember("Rachel", Rank.FIRST_OFFICER);
        greg = new CabinCrewMember("Greg", Rank.PURSER);
        simon = new CabinCrewMember("Simon", Rank.FLIGHT_ATTENDANT);
        ant = new CabinCrewMember("Ant", Rank.FLIGHT_ATTENDANT);
        rose = new CabinCrewMember("Rose", Rank.FLIGHT_ATTENDANT);
        myAwesomePlane = new Plane(PlaneType.AIRBUS350);
        planeTest = new Plane(PlaneType.PLANETEST);
        cabinCrewMembers = new ArrayList<>();
        cabinCrewMembers.add(rachel);
        cabinCrewMembers.add(greg);
        cabinCrewMembers.add(simon);
        passengerOne = new Passenger("Mary", 1);
        passengerTwo = new Passenger("Anna", 5);
        flight001 = new Flight(martynaThePilot, cabinCrewMembers, myAwesomePlane, "FR756", "Paris", "EDI", "9:57");
        flightTest = new Flight(martynaThePilot, cabinCrewMembers, planeTest, "FRXXX", "Paris", "EDI", "9:57");
    }

    @Test
    public void hasPilot () {
        assertEquals("Martyna", flight001.getPilot().getName());
    }

    @Test
    public void hasCabinCrewMembers () {
        assertEquals(3, flight001.getCabinCrewMembers().size());
    }

    @Test
    public void startsWithNoPassengers () {
        assertEquals(0, flight001.getPassengers().size());
    }

    @Test
    public void hasPlane () {
        assertEquals(PlaneType.AIRBUS350, flight001.getPlane().getPlaneType());
    }

    @Test
    public void hasFlightNumber () {
        assertEquals("FR756", flight001.getFlightNumber());
    }

    @Test
    public void hasDestination () {
        assertEquals("Paris", flight001.getDestination());
    }

    @Test
    public void canGetDepartureAirport () {
        assertEquals("EDI", flight001.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime () {
        assertEquals("9:57", flight001.getDepartureTime());
    }

    @Test
    public void canAddCabinCrewMembers () {
        flight001.addCabinCrewMember(rose);
        assertEquals(4, flight001.getCabinCrewMembers().size());
    }

    @Test
    public void canGetAvailableSeats () {
        flight001.bookPassenger(passengerOne);
        assertEquals(409,flight001.getAvailableSeats());
    }

    @Test
    public void canBookPassengers () {
        flight001.bookPassenger(passengerOne);
        assertEquals(1,flight001.getPassengers().size());
    }

    @Test
    public void canTellIfFlightIsFull() {
        flightTest.bookPassenger(passengerOne);
        assertEquals(true,flightTest.isFull());
    }

    @Test
    public void canNotBookWhenFlightIsFull () {
        flightTest.bookPassenger(passengerOne);
        flightTest.bookPassenger(passengerTwo);
        assertEquals(1,flightTest.getPassengers().size());
    }

}