package strategy.exercises_strategy.vehicles;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(new Regular());
        Vehicle bike = new Vehicle(new Slow());
        Vehicle plane = new Vehicle(new Fast());

        System.out.println(car.moveSpeed());
        System.out.println(bike.moveSpeed());
        System.out.println(plane.moveSpeed());
    }
}
