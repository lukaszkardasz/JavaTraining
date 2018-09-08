package training.oop.manufacter;

class ElectroEngine extends Engine{
    public ElectroEngine(int power) {
        capacity= 0;
        power_HP = power;
        rpm = 0;
    }

    @Override
    void increaseRpm() {
        rpm++;
    }

    @Override
    void decreaseRpm() {
        rpm--;
    }

    @Override
    String engineInfo() {
        return "This is eco electric engine [EEE]";
    }
}
