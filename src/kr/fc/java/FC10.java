package kr.fc.java;

import kr.fc.model.MyUtil;

public class FC10 {
    public static void main(String[] args) {
        // 1~10까지 총 합을 구하여 출력하시오
        // 모델 패키지에 MyUtil 클래스 써먹기

        //메소드가 none - static 메소드일 경우
        // MyUtil myUtil = new MyUtil();
        // int sum = myUtil.sum();
        // System.out.println(sum);

        // 메소드가 static 메소드 일 경우
        int sum = MyUtil.sum();
        // 클래스를 사용하는 시점에서 메모리에 올라가게된다.


    }
}
