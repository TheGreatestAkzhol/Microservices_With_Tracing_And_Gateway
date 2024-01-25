package com.example.serverlibrary.connector;

import com.example.serverlibrary.model.Book;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

@Slf4j
public record FallbackWithFactory(String reason) implements BookServiceConnector{
    @Override
    public List<Book> getAllBooks() {
        log.info("Failed send request on book service, {}", reason);
        return Collections.emptyList();
    }
}
