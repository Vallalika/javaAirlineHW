package airlineStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager tom;

    @Before
    public void before() {
        tom = new FlightManager("Tom", Rank.FLIGHT_MANAGER);
    }

    @Test
    public void canGetName() {
        assertEquals("Tom",tom.getName());
    }

    @Test
    public void canGetRankName() {
        assertEquals("Flight manager",tom.getRankName());
    }
}
