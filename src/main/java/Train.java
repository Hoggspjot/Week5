public class Train implements TripStrategy{
    private double kmPerHour = 100.0;

    @Override
    public void travelTime(double distance) {
        System.out.printf("Путешествие на " + distance + " километров на поезде займет %.2f часов\n",distance / kmPerHour);

    }
}
