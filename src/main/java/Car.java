public class Car implements TripStrategy {
    private double kmPerHour = 90.0;


    @Override
    public void travelTime(double distance) {
        System.out.printf("Путешествие на " + distance + " километров на автомобиле займет %.2f часов\n",distance / kmPerHour);

    }
}
