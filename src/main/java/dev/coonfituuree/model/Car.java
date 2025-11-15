package dev.coonfituuree.model;

public class Car implements CarItem{
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final String type;
    private final String transmission;
    private final String fuelType;


    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.type = builder.type;
        this.transmission = builder.transmission;
        this.fuelType = builder.fuelType;
    }


    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private String type;
        private String transmission;
        private String fuelType;
        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }
        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }
        public CarBuilder setTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }
        public CarBuilder setFuelType(String fuelType) {
            this.fuelType = fuelType;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String getDescription() {
        return brand + " " +  model + " " +year + " " +color + " " + type +" "  + transmission + " " + fuelType;

    }

    @Override
    public double getCost() {
        return 0;
    }
}
