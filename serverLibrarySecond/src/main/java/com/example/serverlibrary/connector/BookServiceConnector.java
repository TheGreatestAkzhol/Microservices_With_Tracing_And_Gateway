package com.example.serverlibrary.connector;

import com.example.serverlibrary.config.FeignConfig;
import com.example.serverlibrary.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient( name = "book-service",
        url = "${book-service.url}",
        configuration = FeignConfig.class)
public interface BookServiceConnector {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
