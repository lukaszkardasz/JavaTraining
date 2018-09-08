package training.oop.manufacter;

class ProductionLine {

    public static void main(String[] args) {
        System.out.println("Production stated");

        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            System.out.println(car);
        }


        System.out.println("Production finished");
    }
}
