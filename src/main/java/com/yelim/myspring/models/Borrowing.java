package com.yelim.myspring.models;

import java.util.Date;

public class Borrowing {
    
    private int id;
    private Member member;
    private Book book;
    private Date startTime;
    private Date expiryTime; // 만료일
    private Date returnTime; // 실제 반납한 시간

    public void setId(int id) {
        this.id = id;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public int getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }
}
