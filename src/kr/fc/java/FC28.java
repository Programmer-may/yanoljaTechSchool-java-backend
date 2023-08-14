package kr.fc.java;

import kr.fc.model.BookVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FC28 {
    public static void main(String[] args) {
        // 키보드로 부터 데이터를 입력 받는 방법 : I/O
        // 기본에 많이 쓰던 클래스 : Scanner API
        // 파일, 다른 PC(네트워크)에서 데이터를 입력 받고 출력하는 방법 :  Stream

        //키보드로 부터 데이터 입력
        // 키보드 (외부장치) : System.in ->입력
        // 모니터 장치 (콘솔) : System.out -> 출력

        Scanner scanner = new Scanner(System.in);
        // 연결을 하려면 생성자에 넣어주면 된다.
        // .in -> JNI 자바에서 키보드에서 연결하는 걸 만들어 놨다.

        List<BookVO> list = new ArrayList<>();
        while (true){
            System.out.println("종료");
            String isEnd =scanner.nextLine();
            if(isEnd.equals("종료")){
                break;
            }
            System.out.println("책 제목 : ");
            String title = scanner.nextLine();

            System.out.println("책 가격 : ");
            String price = scanner.nextLine();

            //책 제목과 가격을 하나의 구조로 묶어주는 것
            BookVO book = new BookVO(title,Integer.parseInt(price));
            list.add(book);

        }
        printBook(list);
    }
    public static void printBook(List<BookVO> list) {
        for (BookVO book : list) {
            System.out.println(book);
        }
    }
}
