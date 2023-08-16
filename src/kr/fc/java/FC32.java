package kr.fc.java;

import java.io.*;

public class FC32 {
    public static void main(String[] args) {
        //키보드로부터 라인단위로 문자열 받기
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("문자열을 입력하세요.");
        try {
            String line = br.readLine(); //라인 단위로 읽기, 엔터를 제외한
            System.out.println(line);
            br.close(); //스트림 닫기
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 이런 형태로 많이 쓴다
    // 네트워크를 연결할 땐 System.in 대신에 소켓이나 url을 쓴다.
}
