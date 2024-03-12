package repository.exercises_repository.books;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@Data
public class ListBookRepository implements BookRepository {
    private List<Book> books;

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Book " + title + " not found"));
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getTitle().equals(author))
                .toList();
    }

    @Override
    public void saveNewBook(String title, String author) {
        Book book = createBook(title, author);
        books.add(book);
    }

    @Override
    public void deleteBook(String title) {
        books.removeIf(b -> b.getTitle().equals(title));
    }

    @Override
    public Book updateBook(String title, String newTitle, String newAuthor) {
        Optional<Book> client = books.stream()
                .filter(c -> c.getTitle().equals(title))
                .findAny();

        client.ifPresent(c -> {
            c.setTitle(newTitle);
            c.setAuthor(newAuthor);
        });

        return findByTitle(newTitle);
    }

    private static Book createBook(String title, String author) {
        return Book.builder()
                .title(title)
                .author(author)
                .build();
    }
}