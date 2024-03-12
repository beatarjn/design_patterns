package repository.exercises_repository.clothes;

import java.util.List;

public interface ClothesRepository {

    List<Clothes> findAll();
    Clothes findByName(String name);
    List<Clothes> findByYear(int productionYear);
    void saveNewClothes(String name, int productionYear);
    void deleteClothes(String name);
    Clothes updateClothes(String name, String newName, int newProductionYear);
}
