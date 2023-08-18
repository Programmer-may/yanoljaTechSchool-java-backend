package kr.fc.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FC36 {
    public static void main(String[] args) {
        // 키보드로부터 책 데이터를 입력 받아서 파일에 저장(book.txt)
        BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
        try {
            System.out.print("책 제목 : ");
            String title = br.readLine();
            System.out.print("책 가격 : ");
            int price = Integer.parseInt(br.readLine());
            FileWriter fw = new FileWriter("book.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String data = title+" , "+price;
            bw.write(data); // bw.write()라는건 파일에 바로 쓰는게 아니라 버퍼에 임시 작성하는 것이다.
            //버퍼의 크기는 1024로 정해져있는데 큰 버퍼에 조그만한 양의 데이터를 쌓아서 한번에 넘길려고 담아두는 것이다.
            bw.flush(); //데이터를 fw로 밀어줘야한다.
            bw.close(); // 버퍼를 닫아줘야 문서에 완벽하게 작성된다.

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
