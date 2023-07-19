package kr.fc.model;
// 책의 구성 요소 :  제목, 가격, 저자, 등등등
// 요구사항 정의서에 따라 필요없는 속성은 지우고 필요한 속성으로 객체를 만드는것이 모델링이자 class 이다.
public class BookVO {
    // class
    // 1. 모델링도구
    // 2.데이터 타입 측면에선 새로운 자료형을 만드는 도구 (uddt), 새로운 자료형
    public String title; // public , private 등등: 접근 제한자 (Access modifier)
    // 클래스 끼리 접근 가능한지 불가능 한지 제한자를 둔다.
    // 정보 은닉을 위해 접근제한자를 private로 두고 이때 객체에 접근하기 위해 우회적인 방법으로
    // setter, getter 메소드를 갖게된다.
    public int price;

}
