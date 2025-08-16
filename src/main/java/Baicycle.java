public class Baicycle implements TripStrategy{
    @Override
    public double travelTime(double distance) {
        double kmPerHour = 700.0;
        return distance / kmPerHour;
    }
}
