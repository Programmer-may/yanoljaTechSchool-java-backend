package kr.fc.poly2;



public class Cat extends Animal implements Pet{

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }

    @Override
    public void play() {
        System.out.println("사람과 함께 생활한다.");
    }
}
