package kr.fc.java;

public class FC05 {
    public static void main(String[] args) {
        //데이터의 개수에 따른 설명 : 변수 -> 배열(동일한 자료), 기본 배열(int[]), 객체배열(BookVO[])
        // 자료의 종류에 따른 설명 : 배열(동일한 자료0 -> 클래스 (이질적인 자료)
        //변수와 메서드의 관계 : 데이터를 하나만 저장하는 부분에서는 동일한 컨셉
        // 메서드도 동작을 하려면 메모리에 로딩이 되어야한다.
        // static 키워드가 붙은 메소드는 정해진 메모리에 로딩된다.
        //static 키워드가 붙은 메소드는 메모리에 최초 1번만 로딩된다. 이후에 객체를 만들어서 불러도 로딩되지 않는다.

        int a =10;
        int b = 5;
        int v = sum(a,b); //이름: 호출부  기능: 파라미터 패싱(passing)  (a,b)==> 실인수(리얼 파라미터)
        //메인 메소드는 static 메모리 공간에 로딩 되는데 호출해서 쓰려면 호출할 메서드도 static 키워드가 들어가야한다.
        // 파라미터 패싱이 원할히 실행될라면 실인수와 가인수의 개수가 일치하고, 실인수와 가인수의 자료형이 같아야 한다.

        System.out.println("v = "+v);
    }
    //메서드(동작,방법,기능,함수) : sum(메서드 이름이 변수 역할)
    public static int sum(int x, int y){ // 메소드를 하나의 변수처럼 본다면 sum 은 변수명 int는 자료형 return은 변수 sum에 값을 담아서 전송하는 것이다.
        // 접급제한자 +(제한자(static , final))+ 자료형 + 메소드 이름 + (매개변수)
        // static을 갖게 되면 프로그램 시작시 메모리에 자동으로 로딩된다.
        // static을 안 갖은 메소드를 메모리에 올리기 위해선 생성자를 써서 메모리에 로딩해야한다.

        //public int sum(int x, int y) ==> 메소드의 프로토타입 (원형), 정의부
        //int x, int y == 매개 변수,    가인수
        int sum =x+y;

        return sum;
        //int sum =x+y;
        // return sum; ==> 메소드 바디(body), 구현부
    }

}
