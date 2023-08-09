package kr.fc.java;

import kr.fc.poly3.Radio;
import kr.fc.poly3.RemoCon;
import kr.fc.poly3.TV;

public class FC20 {
    public static void main(String[] args) {
        // TV tv = new TV();
        RemoCon tv = new TV();
        tv.chUP(); // 동적 바인딩
        tv.chDown();
        tv.volUp();
        tv.volDown();

        RemoCon radio = new Radio();
        radio.chUP(); // 다형성
        radio.chDown();
        radio.volUp();
        radio.volDown();

        // 다형성? -> 클래스, 상속, 재정의, Upcasting, 동적 바인딩
        //다형성 쓰는 이유 : 하위 클래스의 동작 방식을 몰라도 상위 클래스를 가지고 하위 클래스를 동작시킬 수 있다.
    }
}
