package strategy.exercises_strategy.chargers;

public class Main {

    public static void main(String[] args) {
        Laptop small = new Laptop(new PocketCharger());
        Laptop large = new Laptop(new BigCharger());

        small.charge();
        large.charge();

    }
}
