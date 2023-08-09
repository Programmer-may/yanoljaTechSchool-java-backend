package kr.fc.poly1;

public class Animal { //일반 클래스
    // age , name  -> 상태 정보
    private String name;
    //public 접근 제한자 - 자식이 아닌 다른 클래스도 접근할 수 있다.
    //protected 접근 제한자 - 같은 패키지의 자식 자식클래스만 접근 가능
    // 하지만 부모의 속성도 정보은닉을 해줘야 한다.
    private int age;

    public Animal() { }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("?");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
