package kr.fc.poly2;

public abstract class Animal { //추상 클래스 (불완전한 클래스)
    //public void eat(); //메서드의 머리(원형 , 프로토타입) -> 구현부가 없다.
    //이것이 추상 메소드가 된다. abstract 가 붙어야 한다.
    //추상 클래스는 객체를 생성할 수 없다.
    // Animal animal = new Animal();  -> 불가
    // 구현부가 없기 때문에 animal.eat(); 같은 걸 못한다.

    //하지만 부모역할은 할 수 있다.

    // Animal animal = new Dog();  -> 가능
    //animal.eat(); 하면 자식 클래스에서 오버라이드 된 메소드의 구현부가 구현돼서 가능해진다.



    //A라는 클래스와 B라는 클래스의 동작,기능이 비슷할 때 공통적인 기능을 묶어 한 추상클래스로 만들 수 있다.
    // 근데 A,B의 기능이 약간 다르더라도 공통된 클래스로 묶고 싶을 땐 인터페이스를 써서 상위 클래스로 묶을 수 있다.
    public abstract void eat();

    public void move(){

    }

    // abstract class 라는게 의미적으로 객체를 생성해서 쓰는게 아니라 부모로서 쓰기 위함이란 느낌이 있다.


    /*
    public void play(){
        System.out.println("사람과 함께 움직인다");
    }
    하마 클래스는 공통된 기능을 가질 수 없다.
     */



}
