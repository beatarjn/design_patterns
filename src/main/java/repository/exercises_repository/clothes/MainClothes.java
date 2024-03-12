package repository.exercises_repository.clothes;

import java.util.ArrayList;
import java.util.List;

public class MainClothes {
    private static ClothesRepository repository = new ListClothesRepository(new ArrayList<>());

    public static void main(String[] args) {
        repository.saveNewClothes("Dress", 2013);
        repository.saveNewClothes("Shoes", 2022);
        repository.saveNewClothes("Jacket", 1997);

        List<Clothes> books = repository.findAll();

        System.out.println("All clothes: ");
        books.forEach(System.out::println);

        System.out.println("Clothes found: ");
        System.out.println(repository.findByName("Jacket"));

        System.out.println("Find by year: 2988\nClothes not found: ");
        System.out.println(repository.findByYear(2988));

        System.out.println("Remove clothes: Shoes ");
        repository.deleteClothes("Shoes");

        System.out.println("All clothes after removing shoes: ");
        books.forEach(System.out::println);

        repository.updateClothes("Jacket", "Jeans", 2015);

        System.out.println("All clothes after updating jacket: ");
        books.forEach(System.out::println);
    }
}
