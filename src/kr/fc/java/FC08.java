package kr.fc.java;

import kr.fc.model.BookVO;

public class FC08 {
    public static void main(String[] args) {
        // 데이터  : 기본 자료 -> 객체자료
        BookVO b; // b : 객체(변수)

        b = new BookVO(); // 인스턴스 변수
        // 객체와 인스턴스는 비슷하지만 메모리에서 바라보는 관점은 다르다.
        // 객체가 구체적인 실체를 가르키면 인스턴스 변수라고 할 수 있다. 메모리 상 힙 영역에 로딩
    }
}
