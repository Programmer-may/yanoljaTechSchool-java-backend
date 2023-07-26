package kr.fc.model;

public class MyUtil {
    // private 기본 생성자가 가능한 경우
    // 모든 멤버(변수, 메소드)가 static 일 경우
    // ex) 자바의 대부분 API  :  System.out , Math.max

    public static int sum(){
        int sum=0;
        for (int i = 0; i<=10;i++){
            sum+=i;
        }
        return sum;
    }

    public static int sum(int a ,int b){
        int sum=0;
        for (int i = a; i<=b;i++){
            sum+=i;
        }
        return sum;
    }
}
