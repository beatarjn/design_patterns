package strategy.exercises_strategy.car_gear;

public class Main {

    public static void main(String[] args) {
        Car old = new Car(new Manual());
        Car modern = new Car(new Automatic());

        System.out.print("Old car ");
        old.drivingMode();
        System.out.print("Modern car ");
        modern.drivingMode();
    }
}
