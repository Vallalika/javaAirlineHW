import org.junit.Before;

import static org.junit.Assert.*;

public class PassengerTest {

    Passenger passengerOne;

    @Before
    public void before() {
        passengerOne = new Passenger("Mary", 1);
    }

    @org.junit.Test
    public void canGetName() {
        assertEquals("Mary",passengerOne.getName());
    }

    @org.junit.Test
    public void canGetNumberOfBags() {
        assertEquals(1,passengerOne.getNumberOfBags());
    }
}