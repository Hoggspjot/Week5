public class TransportTipe {

    private TripStrategy tripStrategy;

    public TransportTipe(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    public void setTripStrategy(TripStrategy tripStrategy) {
        this.tripStrategy = tripStrategy;
    }

    public void calculateTime(double distance) {
        tripStrategy.travelTime(distance);
    }
}
