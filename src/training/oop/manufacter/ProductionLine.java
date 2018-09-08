package training.oop.manufacter;

class ProductionLine {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Production stated");

        for (int i = 0; i < 2; i++) {
            Car car = new Car();
            System.out.println(car);
            car.workTime();
        }

        Car car = new Car("Blue", "Tesla", "S", 2017,
                "sedan", 4);
        System.out.println(car);

        Engine engine = new DieselEngine(110,1.9);
        car.setEngine(engine);

        System.out.println(car.getEngine());

        System.out.println("Production finished");

        System.out.println("Run test - start");
        car.workTime();
        car.start();
        Thread.sleep(1300);
        car.workTime();
        Thread.sleep(1690);
        car.stop();
        car.workTime();
        System.out.println("Run test - stop");
    }
}
