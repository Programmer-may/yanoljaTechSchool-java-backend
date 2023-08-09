package kr.fc.poly2;



//개 (object)
public class Dog extends Animal implements Pet{
    //추상 클래스의 추상 메소드의 구현부를 재정의 무조건 해줘야 한다.
    //그렇지 않을려면 이 Dog 클래스 또한 추상 클래스가 되어 버리면 된다.
    //하지만 추상 클래스는 객체를 생성할 수 없다.
    //그래서 추상클래스를 부모로 갖고 있는 클래스(하위 자식 클래스) 들은 추상 클래스가 되면 곤란해진다.

    @Override
    public void eat() {
        System.out.println("개처럼 먹다");
    }

    @Override
    public void play() {
        System.out.println("사람과 함께 생활한다.");
    }
}
