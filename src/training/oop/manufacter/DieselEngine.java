package training.oop.manufacter;

class DieselEngine extends Engine {

    public DieselEngine(int power, double capacity) {
        this.capacity = capacity;
        this.power_HP = power;
        this.gasType = "diesel";
        this.rpm = 0;
    }

    @Override
    void increaseRpm() {
        rpm += 200;
    }

    @Override
    void decreaseRpm() {
        rpm -= 200;
    }

    @Override
    String engineInfo() {
        StringBuilder sb = new StringBuilder("Diesel engine")
                .append("\n\tPower: ").append(power_HP)
                .append("\n\tCapacity: ").append(capacity).append(" L");

        return sb.toString();
    }
}
