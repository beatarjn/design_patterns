package repository.exercises_repository.books;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static BookRepository repository = new ListBookRepository(new ArrayList<>());
    public static void main(String[] args) {

        repository.saveNewBook("1984", "Orwell");
        repository.saveNewBook("Harry Potter", "Rowling");
        repository.saveNewBook("Hobbit", "Tolkien");

        List<Book> books = repository.findAll();

        System.out.println("All books: ");
        books.forEach(System.out::println);

        System.out.println("Book found: ");
        System.out.println(repository.findByTitle("Hobbit"));

        System.out.println("Find by author: Test\nBook not found: ");
        System.out.println(repository.findByAuthor("Test"));

        System.out.println("Remove book: 1984 ");
        repository.deleteBook("1984");

        System.out.println("All books after removing 1984: ");
        books.forEach(System.out::println);

        repository.updateBook("Harry Potter", "Harry Potter and chambers of secrets", "J.K. Rowling");

        System.out.println("All books after updating Harry Potter: ");
        books.forEach(System.out::println);
    }
}
