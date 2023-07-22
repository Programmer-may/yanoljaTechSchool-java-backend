package kr.fc.java;

import kr.fc.model.BookVO;

public class FC04 {
    public static void main(String[] args) {
        //책 3권을 저장할 배열을 선언하시오.
        //BookVO[] books;

        //책 3권을 저장할 객체배열을 생성 하시오
        BookVO[] books = new BookVO[3];
        //0번째 책 정보 넣기
        books[0] = new BookVO();
        books[0].title="자바책";
        books[0].price=35000;

        books[1] = new BookVO();
        books[1].title="파이썬책";
        books[1].price=15000;

        books[2] = new BookVO();
        books[2].title="스프링책";
        books[2].price=25000;

        for(BookVO book:books){
            System.out.printf("title:%s, price:%d\n",book.title,book.price);
        }


    }
}
