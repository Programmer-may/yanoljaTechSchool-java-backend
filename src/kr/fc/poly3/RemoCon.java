package kr.fc.poly3;

public interface RemoCon {
    //공통된 기능만 넣어야 한다.
    //서로 다른 객체의 고통 부분을 묶을 때 사용
    // 객체를 생성할 수 없다.
    // 부모의 역할로 사용 가능하다 (Upcasting)
    // 다중 상속을 지원하기 위해서 사용된다.

    public void chUP();

    public void chDown();

    public void volUp();

    public void volDown();

    //  public void internet(); 공통된 기능이 아니라면 무의미 해진다.
}
