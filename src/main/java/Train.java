public class Train implements TripStrategy{
    @Override
    public double travelTime(double distance) {
        double kmPerHour = 100.0;
        return distance / kmPerHour;
    }
}
