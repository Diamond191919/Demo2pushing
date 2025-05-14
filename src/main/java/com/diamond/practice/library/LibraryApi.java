package com.diamond.practice.library;

import com.diamond.practice.dto.books;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryApi {

    List<books> books = new ArrayList<>();

    @GetMapping("api/library")
    public ResponseEntity listBooks() {
        System.out.println("List Books");
        return ResponseEntity.ok(books);
    }

    @PostMapping("api/library")
    public ResponseEntity addBook(@RequestBody books book) {
        books.add(book);
        return ResponseEntity.ok(books);
    }
}
