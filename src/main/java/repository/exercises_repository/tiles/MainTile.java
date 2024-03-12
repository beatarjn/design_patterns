package repository.exercises_repository.tiles;

import java.util.ArrayList;
import java.util.List;

public class MainTile {

    private static TileRepository repository = new ListTileRepository(new ArrayList<>());
    public static void main(String[] args) {

        repository.saveNewTile("New", 20.1, 10.5, 2.5);
        repository.saveNewTile("Modern", 15.0, 10.5, 2.5);
        repository.saveNewTile("Rustic", 5.0, 5.0, 1.5);

        List<Tile> tiles = repository.findAll();

        System.out.println("All tiles: ");
        tiles.forEach(System.out::println);

        System.out.println("Tile found: ");
        System.out.println(repository.findByCollection("New"));

        System.out.println("Find by length: " + 1.0 + "\nTile not found: ");
        System.out.println(repository.findByLength(1.0));

        System.out.println("Remove tile: Modern ");
        repository.deleteTile("Modern");

        System.out.println("All tiles after removing Modern: ");
        tiles.forEach(System.out::println);

        repository.updateTile("Rustic", "Rustic 2", 6.0, 6.0, 1.5);

        System.out.println("All tiles after updating Rustic: ");
        tiles.forEach(System.out::println);
    }
}
