package repository.exercises_repository.clothes;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ListClothesRepository implements ClothesRepository {

    private List<Clothes> clothes;

    @Override
    public List<Clothes> findAll() {
        return clothes;
    }

    @Override
    public Clothes findByName(String name) {
        return clothes.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Clothes> findByYear(int productionYear) {
        return clothes.stream()
                .filter(c -> c.getProductionYear() == productionYear)
                .toList();
    }

    @Override
    public void saveNewClothes(String name, int productionYear) {
        Clothes newClothes = createClothes(name, productionYear);
        clothes.add(newClothes);
    }

    @Override
    public void deleteClothes(String name) {
        clothes.removeIf(c -> c.getName().equals(name));
    }

    @Override
    public Clothes updateClothes(String name, String newName, int newProductionYear) {
        Optional<Clothes> cloth = clothes.stream()
                .filter(c -> c.getName().equals(name))
                .findAny();

        cloth.ifPresent(c -> {
            c.setName(newName);
            c.setProductionYear(c.getProductionYear());
        });

        return findByName(newName);
    }

    private static Clothes createClothes(String name, int productionYear) {
        return Clothes.builder()
                .name(name)
                .productionYear(productionYear)
                .build();
    }
}