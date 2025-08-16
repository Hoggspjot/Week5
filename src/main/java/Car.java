public class Car {
    private String brand;
    private String modelName;
    private int year;
    private boolean hasAirConditioning;
    private boolean hasMultimedia;

    public Car(CarBuilder carBuilder) {
        brand = carBuilder.brand;
        modelName = carBuilder.modelName;
        year = carBuilder.year;
        hasAirConditioning = carBuilder.hasAirConditioning;
        hasMultimedia = carBuilder.hasMultimedia;
    }

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public boolean isHasMultimedia() {
        return hasMultimedia;
    }

    public static class CarBuilder {
        private String brand;
        private String modelName;
        private int year;
        //необязательные поля
        private boolean hasAirConditioning;
        private boolean hasMultimedia;

        public CarBuilder(String brand, String modelName, int year) {
            this.brand = brand;
            this.modelName = modelName;
            this.year = year;
        }

        public CarBuilder setHasAirConditioning(boolean hasAirConditioning) {
            this.hasAirConditioning = hasAirConditioning;
            return this;
        }

        public CarBuilder setHasMultimedia(boolean hasMultimedia) {
            this.hasMultimedia = hasMultimedia;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
