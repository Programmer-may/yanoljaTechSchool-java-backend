package kr.fc.practice;

public class Midterm_exam03 {
    public static void main(String[] args) {
        String str = "once upon a time";
        System.out.println("원래 문자열 : " + str);

        String[] sArr = str.split(" ");
        for (int i = 0; i < sArr.length; i++) {
            for (int j = i + 1; j < sArr.length; j++) {
                if (sArr[i].compareTo(sArr[j]) > 0) {
                    String temp = sArr[i];
                    sArr[i] = sArr[j];
                    sArr[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : sArr) {
            sb.append(s + " ");
        }
        System.out.println("정렬된 문자열 : " + sb);
    }
}
