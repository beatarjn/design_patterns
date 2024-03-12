package decorator.exercises_decorator.ships;

public class TouristsShip extends Ship{

    private Ship ship;
    private String color;


    public TouristsShip(Ship ship) {
        this.ship = ship;
        color = "Pink";
    }

    @Override
    public void takeOff() {
        System.out.print(color + " tourists ship, ");
        ship.takeOff();
    }
}