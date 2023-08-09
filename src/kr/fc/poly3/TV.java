package kr.fc.poly3;

public class TV implements RemoCon{
    // 부모가 인터페이스면 모든 메소드들을 재정의 해줘야 한다.

    @Override
    public void chUP() {
        System.out.println("TV의 채널이 올라간다.");
    }
    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다.");
    }
    @Override
    public void volUp() {
        System.out.println("TV의 소리가 올라간다.");
    }
    @Override
    public void volDown() {
        System.out.println("TV의 소리가 내려간다.");
    }

}
