package decorator.exercises_decorator.ships;

public class ShipMain {

    public static void main(String[] args) {
        Ship ship = new Ship();

        TouristsShip touristSpaceShip = new TouristsShip(new SpaceShip(ship));
        SpaceShip spaceContainerTouristShip = new SpaceShip(new ContainerShip(new TouristsShip(ship)));
        ContainerShip containerSpaceShip = new ContainerShip(new SpaceShip(ship));

        touristSpaceShip.takeOff();
        spaceContainerTouristShip.takeOff();
        containerSpaceShip.takeOff();
    }
}
