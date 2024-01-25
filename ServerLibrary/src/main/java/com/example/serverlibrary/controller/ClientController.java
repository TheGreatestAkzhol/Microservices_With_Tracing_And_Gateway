package com.example.serverlibrary.controller;

import com.example.serverlibrary.model.Book;
import com.example.serverlibrary.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return clientService.getAllBooks();
    }
    @GetMapping("/test")
    public String getTest(){
        return "First Service";
    }
}
