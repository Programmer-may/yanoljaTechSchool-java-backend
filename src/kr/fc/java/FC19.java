package kr.fc.java;

import kr.fc.poly2.Animal;
import kr.fc.poly2.Dog;

public class FC19 {
    public static void main(String[] args) {
        // Animal ani = new Animal(); Animal은 추상 클래스기 때문에 객체 생성 불가
        Animal ani = new Animal() {
            @Override
            public void eat() {
                System.out.println("?");
            }
        };

        Animal animal = new Dog();
        animal.eat(); //다형성 보장
        animal.move(); //다형성 보장 못함
    }
}
