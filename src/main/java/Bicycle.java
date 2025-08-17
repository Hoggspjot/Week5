public class Bicycle implements TripStrategy{
    private double kmPerHour = 12.0;

    @Override
    public void travelTime(double distance) {
        System.out.printf("Путешествие на " + distance + " километров на велосипеде займет %.2f часов\n",distance / kmPerHour);
    }
}
