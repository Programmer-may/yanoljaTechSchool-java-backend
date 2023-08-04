package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC15 {
    public static void main(String[] args) {
        // Dog 객체를 생성하는 방법 3가지
        //1. 직접접근
        Dog d1 = new Dog();


        //2. 간접 접근 (Upcasting)
        Animal d2 = new Dog();
        d2.eat(); // 개처럼 먹다
        d2 = new Cat();
        d2.eat(); // 고양이처럼 먹다
        //메세지 Polymorphism
        //Polymorphism (다형성) : 상위 클래스가 동일한 메세지로 하위클래스를 서로 다르게 동작시키는 객체지향 원리

        ((Cat)d2).night(); // 다운캐스팅
        // (Cat)d2.night(); -> 이렇게 하면 오류가 생긴다. . 연산자가 (형변환) 형변환 연산자보다 우선순위가 높기 때문이다.
        // ((Cat)d2).night(); 이렇게 () 씌워줘서 우선 순위를 준다.

        //Cat c = (Cat)d2; //다운캐스팅 Animal -> Cat
        //c.night();       // d2에서 접근할 수 없는(오버라이드 안 한) 메소드인 night를 강제로 형변환하여 접근하기




        //3.
        Object d3 = new Dog();
    }

}
