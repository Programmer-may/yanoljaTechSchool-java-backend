package kr.fc.java;

import kr.fc.poly4.A;
import kr.fc.poly4.B;

public class FC23 {
    public static void main(String[] args) {
        //A객체를 생성하는데 업캐스팅으로 생성
        //Object Casting (객체 형변환) : UpCasting, DownCasting
        Object a = new A(); //업캐스팅 -> 자동으로 가능, 묵시적
        ((A)a).display(); // 다운캐스팅 , 명시적

        A a1 = new A();
        B b1 = new B();
        ptr(a1);
        ptr(b1);

        // Object 배열 - 모든 객체든 다 넣을 수 있다.
        // 다형성 배열
        Object[] objects = new Object[2];
        objects[0] = new A();
        objects[1] = new B();
    }
    public static void ptr(Object object){ // 다형성 인수
        if (object instanceof A){
            ((A)object).display(); // 다운 캐스팅
        } else if (object instanceof B) {
            ((B)object).display();
        }
    }
}
