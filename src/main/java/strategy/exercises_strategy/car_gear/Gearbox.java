package strategy.exercises_strategy.car_gear;

public sealed interface Gearbox permits Manual, Automatic {

    void use();
}
