package strategy.exercises_strategy.car_gear;

public non-sealed class Manual implements Gearbox {
    @Override
    public void use() {
        System.out.println("manual");
    }
}
