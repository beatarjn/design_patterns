package repository.exercises_repository.tiles;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tile {

    private String collection;
    private double length;
    private double width;
    private double thickness;
}
