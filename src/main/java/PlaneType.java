public enum PlaneType {

    BOEING747(416, 333400.00),
    BOMBARDIERCRJ200(50, 24040.00),
    AIRBUS350(410,254011.73),
    PLANETEST(1,1000.00);

    private final int capacity;
    private final double maxTakeoffWeight;

    PlaneType(int capacity, double maxTakeoffWeight) {
        this.capacity = capacity;
        this.maxTakeoffWeight = maxTakeoffWeight;
    }

    public int getMaxCapacity() {
        return this.capacity;
    }

    public double getMaxWeight() {
        return this.maxTakeoffWeight;
    }
}
