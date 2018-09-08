package training.oop.manufacter;

class Car {
    private static int carSeriesCounter;

    {
        System.out.println("Static block anonymous");
        VIN_temp = "VIN____" + carSeriesCounter;
        carSeriesCounter++;
    }

    static {
        System.out.println("Static block signature");
        carSeriesCounter = 1_000;
    }

    private String colour;
    private String brand;
    private String model;
    private int yearOfProd;
    private String sortOf;
    private int availableSeats;

    private String VIN;
    private static String VIN_temp;

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
        this("black", "Ford", "T", 1909,
                "hatchback", 2);
    }

    public Car(String colour, String brand, String model,
               int yearOfProd, String sortOf, int availableSeats) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.sortOf = sortOf;
        this.availableSeats = availableSeats;

        this.VIN = VIN_temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car information: ")
                .append("\n\tBrand: ").append(brand)
                .append("\n\tModel: ").append(model)
                .append("\n\tColor: ").append(colour)
                .append("\n\tY of Prod: ").append(yearOfProd)
                .append("\n\tVIN: ").append(VIN);
        return builder.toString();
    }
}
