public class TransportType {

    private TripStrategy tripStrategy;

    public TransportType(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    public void setTripStrategy(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    public void calculateTime(double distance) {
        tripStrategy.travelTime(distance);
    }
}
