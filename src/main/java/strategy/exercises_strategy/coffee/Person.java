package strategy.exercises_strategy.coffee;

public class Person {

    private Coffee coffee;
    private int energy;

    public Person(Coffee coffee) {
        this.coffee = coffee;
        this.energy = 0;
    }

    public void drink() {
        System.out.println("Energy level: " + energy);
        int energyLevel = energy + coffee.coffeeStrength();
        System.out.println("Energy level after coffee: " + energyLevel);
    }
}