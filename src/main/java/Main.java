
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //получаем значение для расчета
        System.out.println("Введите расстояние для расчета");
        double distance = scanner.nextDouble();
        //для примера расчитываем пешком
        TransportType transportType = new TransportType(new Foot());
        transportType.calculateTime(distance);
        //менем поведение (расчет ) динамически
        transportType.setTripStrategy(new Car());
        transportType.calculateTime(distance);

    }
}


