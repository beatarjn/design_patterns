package strategy.exercises_strategy.car_gear;

public class Car {

    private Gearbox gearbox;

    public Car(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public void drivingMode(){
        System.out.println("driving mode: ");
        gearbox.use();
    }
}
