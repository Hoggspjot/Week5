public class Foot implements TripStrategy{
    private double kmPerHour = 6.0;

    @Override
    public void travelTime(double distance) {
        System.out.printf("Путешествие на " + distance + " километров пешком займет %.2f часов\n",distance / kmPerHour);
    }
}
