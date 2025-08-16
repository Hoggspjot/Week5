public class Main {
    public static void main(String[] args) {

        Car car = new Car.CarBuilder("Dodge", "Ram", 2025)
                .setHasAirConditioning(true)
                .setHasMultimedia(true).build();

        System.out.println("Бренд - "+car.getBrand());
        System.out.println("Модель - "+ car.getModelName());
        System.out.println("Год выпуска - " + car.getYear());
        System.out.println("Имеется кондиционер? - " + car.isHasAirConditioning());
        System.out.println("Имеется мультимедиа? - " + car.isHasMultimedia());
    }
}
