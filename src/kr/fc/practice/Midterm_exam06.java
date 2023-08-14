package kr.fc.practice;

public class Midterm_exam06 {
    public static void main(String[] args) {
        //아래 str변수에 저장된 "1#2#3#4#5" 문자열에서 #을 기준으로 문자열을 분리한 후 모두 더하여 15를 출력하도록 코드를 작성하시오.
        String str = "1#2#3#4#5";
        String[] arr = str.split("#");
        int result = 0;
        for (String s : arr) {
            result += Integer.parseInt(s);
        }
        System.out.println(result);

        //다른 방법
        int sum =0;
        for (int i=0; i< arr.length;i++){
            sum += arr[i].charAt(0)-'0';
        }
        System.out.println(sum);
    }
}
