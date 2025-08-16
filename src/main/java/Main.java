import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние");
        double distance = scanner.nextDouble();
        TransportTipe transportTipe = new TransportTipe(new Foot(distance));

    }
}


