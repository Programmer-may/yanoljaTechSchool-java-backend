package kr.fc.java;

import kr.fc.model.BookVO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FC35 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("member.txt"));
            String line;
            List<BookVO> list = new ArrayList<>();
            while ( (line=br.readLine()) != null) {
                String[] book = line.split(",");
                list.add(new BookVO(book[0],Integer.parseInt(book[3])));
            }
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
