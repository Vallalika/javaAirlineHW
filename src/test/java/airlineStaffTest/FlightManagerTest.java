//package airlineStaffTest;
//
//import airlineStaff.CabinCrewMember;
//import airlineStaff.FlightManager;
//import airlineStaff.Pilot;
//import airlineStaff.Rank;
//import javaAir.Flight;
//import javaAir.Passenger;
//import javaAir.Plane;
//import javaAir.PlaneType;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.Assert.assertEquals;
//
//public class FlightManagerTest {
//
//    FlightManager tom;
//    Flight flight001;
//    Pilot martynaThePilot;
//    CabinCrewMember rachel;
//    CabinCrewMember greg;
//    CabinCrewMember simon;
//    CabinCrewMember ant;
//    CabinCrewMember rose;
//    Plane myAwesomePlane;
//    ArrayList<CabinCrewMember> cabinCrewMembers;
//    Passenger passengerOne;
//    Passenger passengerTwo;
//
//    @Before
//    public void before() {
//        tom = new FlightManager("Tom", Rank.FLIGHT_MANAGER);
//        martynaThePilot = new Pilot("Martyna", Rank.CAPTAIN, "OSS117");
//        rachel = new CabinCrewMember("Rachel", Rank.FIRST_OFFICER);
//        greg = new CabinCrewMember("Greg", Rank.PURSER);
//        simon = new CabinCrewMember("Simon", Rank.FLIGHT_ATTENDANT);
//        ant = new CabinCrewMember("Ant", Rank.FLIGHT_ATTENDANT);
//        rose = new CabinCrewMember("Rose", Rank.FLIGHT_ATTENDANT);
//        myAwesomePlane = new Plane(PlaneType.AIRBUS350);
//        cabinCrewMembers = new ArrayList<>();
//        cabinCrewMembers.add(rachel);
//        cabinCrewMembers.add(greg);
//        cabinCrewMembers.add(simon);
//        passengerOne = new Passenger("Mary", 1);
//        passengerTwo = new Passenger("Anna", 5);
//        flightTest = new Flight(martynaThePilot, cabinCrewMembers, planeTest, "FRXXX", "Paris", "EDI", "9:57");
//    }
//
//    @Test
//    public void canGetName() {
//        assertEquals("Tom",tom.getName());
//    }
//
//    @Test
//    public void canGetRankName() {
//        assertEquals("javaAir.Flight manager",tom.getRankName());
//    }
//
//    @Test
//    public void canGetBaggageWeightPerPassenger() {
//
//    }
//}
