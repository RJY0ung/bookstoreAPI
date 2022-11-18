package com.api.bookstore.service;


import com.api.bookstore.entity.Books;
import com.api.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class BookService {

    List<String> testData = new ArrayList<String>();
    List<Books> booksList = new ArrayList<>(Arrays.asList(
        new Books(1, "1", "t1", (ArrayList<String>) testData, 2022, 20.00d, "fiction"),
        new Books(2, "2", "t2", (ArrayList<String>) testData, 2022, 19.00d, "non fiction")
    ));

    @Autowired
    BookRepository bookRepository;

    public List<Books> getAllBooks(){
        //return bookList;
        return bookRepository.findAll();
    }

    public Books getABook(int id){

        Books books = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        return books;
    }

    public void createBook(Books books){
        //bookList.add(book);
        bookRepository.save(books);
    }

    public void updateBook(Books books){
        bookRepository.save(books);
    }

    public void deleteBook(int id){
        bookRepository.delete(bookRepository.getById(id));
    }

}
