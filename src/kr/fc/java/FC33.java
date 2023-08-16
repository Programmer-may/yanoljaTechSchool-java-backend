package kr.fc.java;

import java.io.*;

public class FC33 {
    public static void main(String[] args) {
        // 키보드로부터 문자열을 계속 입력 받다가 exit를 입력하면 종료하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("문자열을 입력하세요 : ");
        try {
            while ((line = br.readLine()) != null) {
                if (line.equals("exit")) break;
                System.out.println(line);
                System.out.println("문자열을 입력하세요 : ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
