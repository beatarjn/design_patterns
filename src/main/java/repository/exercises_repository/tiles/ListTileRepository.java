package repository.exercises_repository.tiles;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@Data
public class ListTileRepository implements TileRepository {
    private List<Tile> tiles;

    @Override
    public List<Tile> findAll() {
        return tiles;
    }

    @Override
    public Tile findByCollection(String collection) {
        return tiles.stream()
                .filter(t -> t.getCollection().equals(collection))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Tile " + collection + " not found"));
    }

    @Override
    public Tile findByLength(double length) {
        return tiles.stream()
                .filter(t -> t.getLength() == length)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void saveNewTile(String collection, double length, double width, double thickness) {
        Tile tile = createTile(collection, length, width, thickness);
        tiles.add(tile);
    }

    @Override
    public void deleteTile(String collection) {
        tiles.removeIf(t -> t.getCollection().equals(collection));
    }

    @Override
    public Tile updateTile(String collection, String newCollection, double newLength, double newWidth, double newThickness) {
        Optional<Tile> tile = tiles.stream()
                .filter(t -> t.getCollection().equals(collection))
                .findAny();

        tile.ifPresent(t -> {
            t.setCollection(newCollection);
            t.setLength(newLength);
            t.setWidth(newWidth);
            t.setThickness(newThickness);
        });

        return findByCollection(newCollection);
    }

    private static Tile createTile(String collection, double length, double width, double thickness) {
        return Tile.builder()
                .collection(collection)
                .length(length)
                .width(width)
                .thickness(thickness)
                .build();
    }
}