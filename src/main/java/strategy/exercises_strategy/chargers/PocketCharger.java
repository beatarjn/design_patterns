package strategy.exercises_strategy.chargers;

public class PocketCharger implements Charger{
    @Override
    public int chargingSpeed() {
        return 10;
    }

    @Override
    public String colour() {
        return "Color: white";
    }

    @Override
    public String shape() {
        return "Shape: small circle";
    }
}
