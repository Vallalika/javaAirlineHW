package airlineStaff;

public class Pilot extends AirlineStaff {

    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
