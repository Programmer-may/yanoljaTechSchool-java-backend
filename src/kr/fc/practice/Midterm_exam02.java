package kr.fc.practice;

import java.util.stream.IntStream;

public class Midterm_exam02 {
    public static void main(String[] args) {
        String s = "Hello Java";
        System.out.println("원래 문자열: " + s);
        System.out.println("반전 문자열: " + reverseString(s));

        //다른 방법
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }

        //다른 방법 - 스트림 이용 (IO 스트림 아님)
        //collection 자료구조를 바이트 열로 변화를 시킨 후에 병렬로 조작하고자 할 때
        //a().b().c()  -> 메소드를 병렬로
        //뒤집고, 대문자로 바꾸고, 정렬해야 한다.
        IntStream stream = s.chars(); //IntStream - 넣어준 문자열이 바이트 단위로 되어 있다.
        stream.mapToObj(c->(char) c)
                .reduce("",(str,character)->character+str, String::concat)
                .chars()
                .forEach(character -> System.out.print((char)character));
        //concat은 결합이다
        //.reduce("",(str,character)->character+str, String::concat) 이걸 쓰면 결국 문자열이 뒤집어짐
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

}
