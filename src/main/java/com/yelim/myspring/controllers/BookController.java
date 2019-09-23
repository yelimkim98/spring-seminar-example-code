package com.yelim.myspring.controllers;

import com.yelim.myspring.models.Book;
import com.yelim.myspring.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method= RequestMethod.POST)
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @RequestMapping(method=RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public boolean updateMember(@PathVariable("id") String id, @RequestBody Book book){
        return bookService.updateBook(id, book);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public boolean deleteBook(@PathVariable("id") String id){
        return bookService.deleteBook(id);
    }
}