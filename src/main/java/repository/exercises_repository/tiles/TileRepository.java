package repository.exercises_repository.tiles;

import java.util.List;

public interface TileRepository {

    List<Tile> findAll();
    Tile findByCollection(String collection);
    Tile findByLength(double length);
    void saveNewTile(String collection, double length, double width, double thickness);
    void deleteTile(String collection);
    Tile updateTile(String collection, String newCollection, double newLength, double newWidth, double newThickness);

}