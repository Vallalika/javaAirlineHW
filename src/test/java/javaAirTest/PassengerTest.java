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

    @Before
    public void before() {
        passengerOne = new Passenger("Mary", 1);
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
}