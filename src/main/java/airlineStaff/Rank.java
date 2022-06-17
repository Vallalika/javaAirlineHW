package airlineStaff;

public enum Rank {
    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight attendant");

    private final String rankName;

    Rank(String rankName) {
        this.rankName = rankName;
    }

    public String getRankName() {
        return rankName;
    }

}
