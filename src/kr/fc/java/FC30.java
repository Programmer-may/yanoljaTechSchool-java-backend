package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;

public class FC30 {
    public static void main(String[] args) {
        /*
    스트림의 분류 : java.io
    1. 데이터(binary data , text data)의 종류에 따른 분류
    1) 바이트 스트림 : 이진데이터(바이너리 데이터)를 처리하는 스트림
    - 바이트 입력 스트림 : InputStream(인터페이스) - read() 기능을 갖고 있다. 바이트 단위로 읽기
    - 바이트 출력 스트림 : OutputStream - write() 기능을 갖고 있다. 바이트 단위로 쓰기
        ex) 파일에서 바이트데이터를 읽으려면 어떤 스트림이 필요한가?
        FileInputStream
        ex) 파일에서 바이트데이터를 쓰려면 어떤 스트림이 필요한가?
        FileOutputStream

    2)문자 스트림 : 문자 데이터를 처리하는 스트림( 스트림 내부에서 문자 인코딩이 적용된다.)
    - 문자 입력 스트림 : Reader - read() : 문자 단위로 데이터를 읽기
    - 문자 출력 스트림 : Writer - write() , print() , println() : 문자 단위로 쓰기
        ex) 파일에서 문자데이터를 읽으려면 어떤 스트림이 필요한가?
        FileReader
        ex) 파일에서 문자데이터를 쓰려면 어떤 스트림이 필요한가?
        FileWriter

        4바이트 int 형을 어떻게 처리하나 : int -> byte[]
                                      byte[] - > int

     2. 처리 방식에 따른 분류
     1) 노드스트림 : 입출력 데이터에 가장 먼저 연결되는 스트림
     2) 필터스트림 : 단독으론 사용 불가 , 반드시 노드스트림에 연결(연쇄)해서 사용
        : 입출력의 성능을 개선시키는 용도
        버퍼기능이 있는 스트림 - BufferedInputStream , BufferedOutputStream ,
                            BufferedReader,  BufferedWriter

        -브릿지스트림(필터 스티림의 일종) :
        바이트 입력스트림을 문자입력 스트림으로 변환 : InputStreamReader
        바이트 출력스트림을 문자출력 스트림으로 변환 : OutputStreamWriter

     */

        //키보드로 부터 영문 여러자를 입력해서 출력하시오
        InputStream is = System.in;
        System.out.println("영문 한글자를 입력"); // A
        try {
            int data = is.read();
            System.out.print(data); //65
            data = is.read();
            System.out.print(data); //10 -> 개행문자
            data = is.read();
            // read()가 더이상 읽어들일 데이터가 없을 경우 -1을 반환한다.
            System.out.print(data);
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
        // try catch  : 예외를 직접적으로 처리
        // throws IOException : 예외를 JVM으로 던져서 간접적으로 처리
    }
}
