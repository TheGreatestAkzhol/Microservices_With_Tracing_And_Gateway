package com.example.serverlibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Book {
    private String id;
    private String title;
    private String description;
    private String imageLink;
}
