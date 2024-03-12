package decorator.exercises_decorator.ships;

public class SpaceShip extends Ship {

    private Ship ship;
    private String color;

    public SpaceShip(Ship ship) {
        this.ship = ship;
        color = "Silver";
    }

    @Override
    public void takeOff() {
        System.out.print(color + " space ship, ");
        ship.takeOff();
    }

}