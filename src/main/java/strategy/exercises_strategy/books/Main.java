package strategy.exercises_strategy.books;

public class Main {

    public static void main(String[] args) {
        Shelf crime = new Shelf(new Crime());
        Shelf love = new Shelf(new LoveStory());
        Shelf thriller = new Shelf(new Thriller());

        System.out.println("Books on my shelf: ");
        crime.pickBook();
        love.pickBook();
        thriller.pickBook();
    }
}