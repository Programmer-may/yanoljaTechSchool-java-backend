package kr.fc.practice;

public class Midterm_exam05 {
    public static void main(String[] args) {
        //아래 char[] 배열에 저장된 문자에서 대문자의 합과 소문자의 합을 각각 구하여 출력하는 코드를 작성하시오.
        char[] arr = {'A', 'b', 'C', 'd', 'E', 'f', 'G', 'h'};
        int upper_sum = 0;
        int lower_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                upper_sum += arr[i];
            } else if ('a' <= arr[i] && arr[i] <= 'z') {
                lower_sum += arr[i];
            }
        }
        System.out.println("대문자 합 : " + upper_sum + "\n" + "소문자 합 : " + lower_sum);
    }
}
