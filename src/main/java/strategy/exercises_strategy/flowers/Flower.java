package strategy.exercises_strategy.flowers;

public sealed interface Flower permits Rose, Sunflower, Tulip {

    void bloom();
}
