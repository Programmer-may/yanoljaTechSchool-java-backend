package kr.fc.model;
// 책의 구성 요소 :  제목, 가격, 저자, 등등등
// 요구사항 정의서에 따라 필요없는 속성은 지우고 필요한 속성으로 객체를 만드는것이 모델링이자 class 이다.
public class BookVO {
    // class
    // 1. 모델링도구
    // 2.데이터 타입 측면에선 새로운 자료형을 만드는 도구 (uddt), 새로운 자료형
    private String title; // public , private 등등: 접근 제한자 (Access modifier)
    // 클래스 끼리 접근 가능한지 불가능 한지 제한자를 둔다.
    // 정보 은닉을 위해 접근제한자를 private로 두고 이때 객체에 접근하기 위해 우회적인 방법으로
    // setter, getter 메소드를 갖게된다.
    private int price;

    public BookVO(){}
    //생략된 생서자 메소드: 디폴트 생성자
    //리턴 타입이 없다
    //클래스 명과 메소드 명이 같다.
    // 자신의 모든 멤버변수들을 메모리에 로딩한다.


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { // DI - 의존성 주입 디펜던시 인젝션
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
