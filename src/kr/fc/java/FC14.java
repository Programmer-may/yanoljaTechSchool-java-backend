package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC14 {
    public static void main(String[] args) {
        //다형성 (추상 클래스 , 인터페이스)

        Dog d = new Dog();


        Cat c =new Cat();

        printEat(d);

    }
    // Dog , Cat 객체를 매개 변수로 받아서 eat() 를 동작 시키는 메서드 정의
    public static void printEat(Animal animal){ //다형성 인수
        animal.eat();
    }

}
