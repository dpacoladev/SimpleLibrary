package dpacoladev.com.github.simple_library.repositories;

import dpacoladev.com.github.simple_library.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> { }
