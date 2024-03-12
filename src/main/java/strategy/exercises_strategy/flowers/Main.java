package strategy.exercises_strategy.flowers;

public class Main {
    public static void main(String[] args) {
        Flowerpot rosePot = new Flowerpot(new Rose());
        Flowerpot tulipPot = new Flowerpot(new Tulip());
        Flowerpot sunflowerPot = new Flowerpot(new Sunflower());

        rosePot.bloomFlower();
        tulipPot.bloomFlower();
        sunflowerPot.bloomFlower();
    }
}