public class Airplane implements TripStrategy{
    private double kmPerHour = 700.0;

    @Override
    public void travelTime(double distance) {
        System.out.printf("Путешествие на " + distance + " километров на самолете займет %.2f часов\n",distance / kmPerHour);
    }
}
