package repository.exercises_repository.clothes;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Clothes {

    private String name;
    private int productionYear;
}
