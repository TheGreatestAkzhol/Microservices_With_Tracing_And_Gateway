package com.example.serverlibrary.connector;

import com.example.serverlibrary.model.Book;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
@Component
public class Fallback implements BookServiceConnector{
    @Override
    public List<Book> getAllBooks() {
        return Collections.emptyList();
    }
}
