package kr.fc.java;

import kr.fc.model.BookVO;

public class FC09 {
    public static void main(String[] args) {
        //책 3권을 저장할 배열을 생성
        BookVO[] books = new BookVO[3]; //객체 배열
        //배열의 단점 :  처음부터 크기를 정해줘야한다.
        books[0] = new BookVO("자바",32000);
        books[1] = new BookVO("파이썬",22000);
        books[2] = new BookVO("코틀린",12000);

        //출력
        for (BookVO book : books){
            System.out.println(book);
        }
    }
}
