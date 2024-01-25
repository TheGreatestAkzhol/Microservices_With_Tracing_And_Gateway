package com.libro.v1.tomik.controller;

import com.libro.v1.tomik.model.Book;
import com.libro.v1.tomik.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
