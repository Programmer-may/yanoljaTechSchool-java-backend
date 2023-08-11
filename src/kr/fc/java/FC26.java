package kr.fc.java;

import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

import java.util.ArrayList;
import java.util.List;

public class FC26 {
    public static void main(String[] args) {
        List list = new ArrayList(); //기본  10 사이즈
        list.add(new Dog()); // 업캐스팅 ( Dog -> Object)
        list.add(new Cat());

        //[] 배열의 단점 - 크기에 제한
        //ArrayList 크기에 제한이 없다.

        Dog d = (Dog)list.get(0); //다운캐스팅
        d.eat();

        Cat c = (Cat)list.get(1);
        c.eat();
        c.night();
    }
}
