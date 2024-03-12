package strategy.exercises_strategy.car_gear;

public final class Automatic implements Gearbox {
    @Override
    public void use() {
        System.out.println("automatic");
    }
}
