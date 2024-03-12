package strategy.exercises_strategy.vehicles;

public class Vehicle {

    private Move move;

    public Vehicle(Move move) {
        this.move = move;
    }

    public String moveSpeed() {
        return "Vehicle moves with " + move.speed();
    }
}