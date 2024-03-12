package decorator.exercises_decorator.ships;

public class ContainerShip extends Ship {

    private Ship ship;
    private String color;

    public ContainerShip(Ship ship) {
        this.ship = ship;
        color = "Green";
    }

    @Override
    public void takeOff() {
        System.out.print(color + " container ship ship, ");
        ship.takeOff();
    }
}