package strategy.exercises_strategy.chargers;

public class Laptop {

    private Charger charger;
    private int batteryLevel;

    public Laptop(Charger charger) {
        this.charger = charger;
        this.batteryLevel = 0;
    }

    public void charge() {
        System.out.println("Battery level is: " + batteryLevel);
        System.out.println("Charging with charger: " + charger.colour() + ", " + charger.shape());
        while (batteryLevel < 90) {
            System.out.println("...charging...");
            batteryLevel += charger.chargingSpeed();
        }
        System.out.println("Finished charging. Battery level is now " + batteryLevel);
    }
}
