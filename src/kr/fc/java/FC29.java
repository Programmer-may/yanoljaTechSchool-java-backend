package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class FC29 {
    public static void main(String[] args) {
        //표준입출력 방식 (파일, 메모리, 네트워크)
        // 데이터의 흐름 : Stream
        // 스트림 또한 객체이다.
        InputStream kin = System.in;
        System.out.println("영문자 1개를 입력 : ");
        try{
            int data = kin.read();
            PrintStream cout =System.out;
            cout.println((char) data); // System.out.println(); 우리가 많이 쓰는 출력문의 원형
        }catch (Exception e){ //예외 다형성 어떤 종류의 예외가 오든 다 받을 수 있따.
            e.printStackTrace();
        }
    }
}
