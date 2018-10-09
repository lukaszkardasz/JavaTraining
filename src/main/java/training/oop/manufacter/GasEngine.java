package training.oop.manufacter;

class GasEngine extends Engine implements Catalyst{
    private boolean lpgAvailable = false;

    public GasEngine(boolean lpgAvailable,
                     int power, double capacity) {
        this.capacity = capacity;
        this.power_HP = power;
        this.gasType = "gasoline";
        this.rpm = 0;
        this.lpgAvailable = lpgAvailable;
    }

    public GasEngine(int power, double capacity) {
        this(false, power, capacity);
    }

    @Override
    void increaseRpm() {
        rpm += 350;
    }

    @Override
    void decreaseRpm() {
        rpm -= 350;
    }

    @Override
    String engineInfo() {
        StringBuilder sb = new StringBuilder("Gasoline engine")
                .append("\n\tPower: ").append(power_HP)
                .append("\n\tCapacity: ").append(capacity).append(" L")
                .append("\n\tLPG system: ").append(lpgAvailable);

        return sb.toString();
    }

    void activatedLpgSystem(){
        lpgAvailable = true;
    }

    @Override
    public void cleanExhaust() {
        System.out.println("In progress ......");
    }
}
