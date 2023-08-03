package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Dog;

public class FC15 {
    // Dog 객체를 생성하는 방법 3가지
    //1. 직접접근
    Dog d1 = new Dog();


    //2. 간접 접근 (Upcasting)
    Animal d2 = new Dog();

    //3.
    Object d3 = new Dog();
}
