public class Foot implements TripStrategy{
    private double kmPerHour = 6.0;
    private double distance;

    public Foot(double distance) {
        this.distance = distance;
    }

    @Override
    public double travelTime(double distance) {

        return distance / kmPerHour;
    }
}
