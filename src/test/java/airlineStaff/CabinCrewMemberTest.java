package airlineStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember rachel;

    @Before
    public void before() {
        rachel = new CabinCrewMember("Rachel",Rank.FIRST_OFFICER);
    }

    @Test
    public void canGetName() {
        assertEquals("Rachel",rachel.getName());
    }

    @Test
    public void canGetRankName() {
        assertEquals("First Officer",rachel.getRankName());
    }

}
