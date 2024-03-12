package repository.exercises_repository.books;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();
    Book findByTitle(String title);
    List<Book> findByAuthor(String author);
    void saveNewBook(String title, String author);
    void deleteBook(String title);
    Book updateBook(String title, String newTitle, String newAuthor);

}