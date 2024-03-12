package strategy.exercises_strategy.coffee;

public sealed interface Coffee permits BlackCoffee, Decaf, WhiteCoffee {

    int coffeeStrength();
}
