package sealed_class;

public final class Car extends Vehicle implements Service {

    private final int loadCapacity;

    public Car(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }
}
