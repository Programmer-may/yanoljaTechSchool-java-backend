package kr.fc.poly2;

public class Hippo extends Animal{
    //하마 클래스엔 Pet 인터페이스는 상속시키지 않는다.
    //해당 기능을 하지 않기 때문에

    @Override
    public void eat() {
        System.out.println("하마처럼 먹다");
    }
}
