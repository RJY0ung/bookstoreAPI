package com.api.bookstore.controller;

import com.api.bookstore.entity.Books;
import com.api.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
public class BookController {

    @Autowired
    BookService bookService;

    //get list of all books
    @GetMapping("/books")
    public List<Books> findAllBooks(){
        return bookService.getAllBooks();
    }

    //get a certain book
    @GetMapping("/books/{id}")
    public Books findABook(@PathVariable int id){

        return bookService.getABook(id);
    }

    //add
    @PostMapping("/books")
    public void createBook(@RequestBody Books books)    {
        bookService.createBook(books);
    }

    //update
    @PutMapping("/books/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Books books){
        bookService.updateBook(books);
    }

    //delete
    @DeleteMapping("/books/{id}")
    public List<Books> deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return bookService.getAllBooks();
    }

}

