package airlineStaff;

public class CabinCrewMember extends AirlineStaff {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String relayMessage(String message) {
        return message;
    }
}
