package airlineStaff;

public abstract class AirlineStaff {

    private String name;
    private Rank rank;

    public AirlineStaff(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public String getRankName() {
        return this.rank.getRankName();
    }
}
