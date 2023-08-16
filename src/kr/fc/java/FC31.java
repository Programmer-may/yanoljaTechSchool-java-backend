package kr.fc.java;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FC31 {
    public static void main(String[] args) {

        //키보드로 부터 한글 입력해서 출력하시오
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
                                                //여기서 인코딩이 일어남
        System.out.println("한글 여러자 입력");
        try {
            int data;
            while ((data =isr.read()) != -1 ){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
