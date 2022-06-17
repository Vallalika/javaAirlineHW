public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getMaxCapacity() {
        return this.planeType.getMaxCapacity();
    }

    public double getMaxWeight() {
        return this.planeType.getMaxWeight();
    }
}
