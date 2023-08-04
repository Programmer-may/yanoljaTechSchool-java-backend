package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC17 {
    public static void main(String[] args) {
        // 오브젝트 배열을 쓸 땐 자식 메소드 들이 오버라이드 된 메소드가 아니니 다운 캐스팅을 해야 한다.
        Object[] objs = new Object[2];
        objs[0] = new Dog(); // Upcasting
        objs[1] = new Cat(); // Upcasting

        // 오버라이드 안 된 자식의 메소드 호출하기

        for (Object object : objs){
            if (object instanceof Dog) { // animal의 객체의 자료형이 Dog일 경우
                ((Dog) object).eat(); //다운캐스팅
            } else if (object instanceof Cat) { // animal의 객체의 자료형이 Cat일 경우
                ((Cat) object).eat();
                ((Cat) object).night(); //다운캐스팅
            }
        }

    }
}
