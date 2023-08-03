package kr.fc.poly1;

//개 (object)
public class Dog extends Animal{
    //상속 측면은 속성 측면에서 다가가는게 아니라 동작 측면에서 다가가야 한다.
    // private String name; <- 속성
    // private int age;

    public Dog() {
        super(); // new Animal() ; 자식의 객체를 만드려면 먼저 부모의 객체를 만들고 자식의 객체를 만듦
    }
    public void eat(){
        System.out.println("개처럼 먹다");
    }

}
