package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC18 {
    public static void main(String[] args) {
        // 다형성 인수

        Dog d = new Dog();
        Cat c = new Cat();

        display(d);
        display(c);
    }

    private static void display(Animal animals) {
        // 재정의를 한 경우
        animals.eat(); // 다형성 , 동적 바인딩(재정의, 상속, upcasting)
        // 다형성을 보장하기 위해선 부모클래스의 메소드를 재정의(오버라이드) 해야한다.

        // 재정의를 하지 않은 경우 -> 다형성을 보장하지 않는다.
        // 무조건 재정의를 하게 하기 위하여 추상클래스와 인터페이스가 나오게 됐다.
    }
}
