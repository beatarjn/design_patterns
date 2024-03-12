package strategy.exercises_strategy.books;

public class Shelf {

    private Book book;

    public Shelf(Book book) {
        this.book = book;
    }

    public void pickBook(){
        book.read();
    }
}
