package com.yelim.myspring.services;

import com.yelim.myspring.models.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    private ArrayList<Book> books;

    public BookService(){
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook){
            books.add(newBook);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public Book getBookById(String id){
        // 해당 id를 가진 멤버 반환
        for(Book member : books) {
            if(member.getId().equals(id)){
                return member;
            }
        }

        // 같은애가 없었으면 여기에 도달함
        return null;
    }
/*
    public ArrayList<Book> getBookByName(String name){

    }

    public ArrayList<Book> getBookByAuthor(String auth){

    }
  */
    public boolean updateBook(String id, Book updatedBook){
        // 멤버 수정
        for(Book member : books) {
            if(member.getId().equals(id)){
                member.setName(updatedBook.getName());
                member.setAuthor(updatedBook.getAuthor());
                return true;
            }
        }
        return false;
    }

    public boolean deleteBook(String id){
        // 이 id를 가진 책을 삭제
        for(Book book : books) {
            if(book.getId().equals(id)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
