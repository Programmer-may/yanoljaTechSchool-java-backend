package kr.fc.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FC34 {
    public static void main(String[] args) {
        // 파일 핸들링 하기
        // 파일에 있는 데이터를 읽기 (이미지 - 카피 / 문자)
        // 파일에서 문자 데이터를 읽어 오기 위한 스트림 연결
        try {
            FileReader fr = new FileReader("member.txt");
            int data;
            int cnt=0;
            while ( (data=fr.read()) != -1) {
                System.out.print((char) data);
                cnt++;
            }
            System.out.println(cnt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //버퍼 사용하기
        try {
            BufferedReader br = new BufferedReader(new FileReader("member.txt"));
            String line;
            int cnt=0;
            while ( (line=br.readLine()) != null) {
                System.out.println(line);
                cnt++;
            }
            System.out.println(cnt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
