package dpacoladev.com.github.simple_library.controllers;

import dpacoladev.com.github.simple_library.domain.book.Book;
import dpacoladev.com.github.simple_library.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<Book> create(@RequestBody Book book) {
        return bookService.create(book);
    }
}
