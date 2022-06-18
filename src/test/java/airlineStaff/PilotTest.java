package airlineStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilotOne;

    @Before
    public void before() {
        pilotOne = new Pilot("Martyna",Rank.CAPTAIN,"OSS117");
    }

    @Test
    public void canGetPilotName() {
        assertEquals("Martyna",pilotOne.getName());
    }

    @Test
    public void canGetRankAsString() {
        assertEquals("Captain",pilotOne.getRankName());
    }

    @Test
    public void canGetLicenseNumber() {
        assertEquals("OSS117",pilotOne.getLicenseNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("Ready for take off!", pilotOne.flyPlane());
    }
}