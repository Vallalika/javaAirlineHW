import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane myCoolPlane;

    @Before
    public void before() {
        myCoolPlane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, myCoolPlane.getPlaneType());
    }

    @Test
    public void canGetPlaneMaxCapacity() {
        assertEquals(416, myCoolPlane.getMaxCapacity());
    }

    @Test
    public void canGetPlaneMaxWeight() {
        assertEquals(333400.00, myCoolPlane.getMaxWeight(), 0.00);
    }

}
