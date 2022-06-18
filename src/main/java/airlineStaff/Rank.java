package airlineStaff;

public enum Rank {
    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("javaAir.Flight attendant"),
    FLIGHT_MANAGER("javaAir.Flight manager");

    private final String rankName;

    Rank(String rankName) {
        this.rankName = rankName;
    }

    public String getRankName() {
        return rankName;
    }

}
