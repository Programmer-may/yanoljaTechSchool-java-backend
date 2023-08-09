package kr.fc.poly1;

//개 (object)
public class Dog extends Animal{
    //상속 측면은 속성 측면에서 다가가는게 아니라 동작 측면에서 다가가야 한다.
    // private String name; <- 속성
    // private int age;

    /*
    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }
    부모의 상태 정보에 초기화를  자식이 하고 있다.
    객체의 초기화는 객체 자기 자신이 하는 것이 이상적이다.
     */
    public Dog(String name, int age) {
        super(name,age); //자식이 부모의 생성자를 명시적으로 호출
        //객체의 초기화는 아무리 상속해줬더라도, 부모 자기 자신이 값을 받아 속성을 초기화 해야한다.
    }

    public Dog() {
        super(); // new Animal() ; 자식의 객체를 만드려면 먼저 부모의 객체를 만들고 자식의 객체를 만듦
    }
    public void eat(){
        System.out.println("개처럼 먹다");
    }

}
