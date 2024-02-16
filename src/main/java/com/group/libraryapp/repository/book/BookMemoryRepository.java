package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookMemoryRepository implements BookRepository{
    private final List<String> books = new ArrayList<>();

    @Override
    public void save(String bookName) {
        books.add(bookName);
    }
}
