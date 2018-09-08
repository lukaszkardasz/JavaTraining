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
