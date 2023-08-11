package kr.fc.java;

import kr.fc.api.MyObjectArray;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC25 {
    public static void main(String[] args) {
        MyObjectArray obrArr = new MyObjectArray();
        obrArr.add(new Dog());
        obrArr.add(new Cat());
        for (int i =0; i<obrArr.size();i++) {
            Object obj = (Dog) obrArr.get(i);
            if (obj instanceof Dog) {
                ((Dog)obj).eat();
            } else {
                ((Cat)obj).eat();
                ((Cat)obj).night();
            }
        }

        //자바에선 예외를 객체로 취급한다.
        //예외 클래스의 부모클래스 >
    }
}
