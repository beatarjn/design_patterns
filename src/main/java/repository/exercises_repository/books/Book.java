package repository.exercises_repository.books;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

    private String title;
    private String author;
}
