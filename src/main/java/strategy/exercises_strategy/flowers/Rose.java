package strategy.exercises_strategy.flowers;

public non-sealed class Rose implements Flower {
    @Override
    public void bloom() {
        System.out.println("Red rose");
    }
}
