public class Car implements TripStrategy {

    @Override
    public double travelTime(double distance) {
        double kmPerHour = 90.0;
        return distance / kmPerHour;
    }
}
