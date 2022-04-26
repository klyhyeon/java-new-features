package sealed_class;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("0104915", 200);
        Truck truck = new Truck("0109399", 800);
        System.out.println("carMaxServiceInterval: " + car.getMaxServiceIntervalInMonths());
        System.out.println("MaxDistance: " + car.getMaxDistanceBetweenServicesInKilometers());
        System.out.println("carRegistrationNumber: " + car.getRegistrationNumber());
    }
}
