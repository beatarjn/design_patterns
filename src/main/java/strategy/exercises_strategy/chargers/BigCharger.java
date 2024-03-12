package strategy.exercises_strategy.chargers;

public class BigCharger implements Charger{
    @Override
    public int chargingSpeed() {
        return 50;
    }

    @Override
    public String colour() {
        return "color: black";
    }

    @Override
    public String shape() {
        return "shape: big round";
    }
}
