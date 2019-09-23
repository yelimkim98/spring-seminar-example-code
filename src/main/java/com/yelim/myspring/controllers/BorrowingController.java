package com.yelim.myspring.controllers;

import com.yelim.myspring.models.Borrowing;
import com.yelim.myspring.services.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowings")
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @GetMapping
    public List<Borrowing> getAllBorrowings(){
        return borrowingService.getAllBorrowing();
    }

    @GetMapping("/{id}")
    public Borrowing getBorrowingById(@PathVariable int id){
        return borrowingService.getBorrowingById(id);
    }

    @PostMapping("/{memberId}/{bookId}")
    public void borrow(@PathVariable String memberId, @PathVariable String bookId){
        borrowingService.borrow(memberId, bookId);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        borrowingService.deleteBorrowing(id);
    }

    @PutMapping("/{memberId}/{bookId}")
    public void returnBook(@PathVariable String memberId, @PathVariable String bookId){
        borrowingService.returnBook(memberId, bookId);
    }
}
