package kr.fc.java;

import kr.fc.model.BookVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FC27 {
    public static void main(String[] args) {
        //ArrayList를 이용해서 책 3권 저장하고 출력

        List<BookVO> books = new ArrayList<>();
        books.add(new BookVO("자바",12000));
        books.add(new BookVO("파이썬",24000));
        books.add(new BookVO("C++",30000));

        System.out.println(books);
    }
}
