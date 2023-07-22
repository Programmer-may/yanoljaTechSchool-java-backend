package kr.fc.java;

import kr.fc.model.BookVO;

public class FC01 {
    public static void main(String[] args) {
        //[정수] 1개를 저장할 [변수를 선언]하시오.
        int a ;
        //a라는 변수에 10을 저장하시오.
        a=10;

        // 책 1권을 저장할 변수를 선언하시오.
        BookVO book;
        //book에 [자바책, 35000] 저장하시오.
        // book="자바책",35000; 절대불가 book에 바로 변수 값을 넣는것이 아니라 번지(참조)를 넣는 것이다.
        book = new BookVO(); //new :생성자 1.객체를 생성해주고(인스턴스를 만드는 과정) 2. 초기화를 해준다.
        book.title="자바책";
        book.price=35000;
    }
}
