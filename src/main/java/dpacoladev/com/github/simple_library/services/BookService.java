package dpacoladev.com.github.simple_library.services;

import dpacoladev.com.github.simple_library.domain.book.Book;
import dpacoladev.com.github.simple_library.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public List<Book> create(Book book) {
        bookRepository.save(book);
        return findAll();
    }

    public List<Book> deleteById(String id) {
        bookRepository.deleteById(id);
        return findAll();
    }

    public List<Book> update(Book book) {
        bookRepository.save(book);
        return findAll();
    }
}
