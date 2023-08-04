package kr.fc.java;

import kr.fc.poly1.Animal;
import kr.fc.poly1.Cat;
import kr.fc.poly1.Dog;

public class FC16 {
    public static void main(String[] args) {
        // 1. 다형성 배열
        // Dog, Cat을 저장할 [배열을 생성]을 하세요.

        Animal[] animals = new Animal[2]; // 다형성 배열
        animals[0] = new Dog();
        animals[1] = new Cat();


        Animal[] animals2 = {new Dog(),new Cat()};

        //오버라이드된 eat()와 오버라이드 안 된 night 출력하기
        for (Animal animal : animals){
            animal.eat();
            if (animal instanceof Cat) { // animal의 객체의 자료형이 Cat일 경우
                ((Cat) animal).night(); //다운캐스팅
            }
        }
    }
}
