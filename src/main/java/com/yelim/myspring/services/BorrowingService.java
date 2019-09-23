package com.yelim.myspring.services;

import com.yelim.myspring.models.Book;
import com.yelim.myspring.models.Borrowing;
import com.yelim.myspring.models.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BorrowingService {

    private List<Borrowing> borrowings;

    @Autowired
    private MemberService memberService;
    @Autowired
    private BookService bookService;


    public BorrowingService(){
        borrowings = new ArrayList<>();
    }

    public List<Borrowing> getAllBorrowing(){
        return this.borrowings;
    }

    public Borrowing getBorrowingById(int borrowingId){
        for(Borrowing borrowing : borrowings){
            if(borrowing.getId() == borrowingId) return borrowing;
        }

        return null;
    }

    // 대출 내역 만들기
    // 대출하려면 사람과 책이 필요함
    public void borrow(String memberId, String bookId){

        Member member = memberService.getMemberById(memberId);
        Book book = bookService.getBookById(bookId);

        Borrowing borrowing = new Borrowing();
        borrowing.setId(borrowings.size());
        borrowing.setMember(member);
        borrowing.setBook(book);
        borrowing.setStartTime(new Date());

        borrowings.add(borrowing);
    }

    public boolean deleteBorrowing(int id){
        // 대출 기록 삭제
        for(Borrowing borrowing : borrowings) {
            if(borrowing.getId() == id){
                borrowings.remove(borrowing);
                return true;
            }
        }
        return false;
    }

    public void returnBook(String memberId, String bookId){
        for(Borrowing borrowing : borrowings){
            String mMemberId = borrowing.getMember().getId();
            String mBookId = borrowing.getBook().getId();

            if(mMemberId.equals(memberId) && mBookId.equals(bookId)){
                borrowing.setReturnTime(new Date());
            }
        }
    }
}