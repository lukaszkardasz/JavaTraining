package training.oop.manufacter;

class Car {
    private String colour;
    private String brand;
    private String model;
    private int yearOfProd;
    private String sortOf;
    private int availableSeats;

    void start() {
    }

    void stop() {
    }

    void runForward() {
    }

    void runBack() {
    }

    void turn(String direction) {
    }

    void speedUp() {
    }

    void speedDown() {
    }

    public Car() {
        brand = "Ford";
        model = "T";
        colour = "black";
        yearOfProd = 1909;
        availableSeats = 2;
        sortOf = "hatchback";
    }

    public Car(String colour, String brand, String model,
               int yearOfProd, String sortOf, int availableSeats) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.sortOf = sortOf;
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car information: ")
                .append("\n\tBrand: ").append(brand)
                .append("\n\tModel: ").append(model)
                .append("\n\tColor: ").append(colour)
                .append("\n\tY of Prod: ").append(yearOfProd);
        return builder.toString();
    }
}
