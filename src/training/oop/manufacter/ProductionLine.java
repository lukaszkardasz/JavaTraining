package training.oop.manufacter;

class ProductionLine {

    public static void main(String[] args) {
        System.out.println("Production stated");

        for (int i = 0; i < 2; i++) {
            Car car = new Car();
            System.out.println(car);
        }

        Car car = new Car("Blue", "Tesla", "S", 2017,
                "sedan", 4);
        System.out.println(car);

        System.out.println("Production finished");
    }
}
