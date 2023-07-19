package kr.fc.java;
import kr.fc.model.BookVO;

import java.lang.*;
public class HelloJava { //메인 , 시작 클래스가 되려면 메인 메소드가 있어야한다.
    public static void main(String[] args) {
        System.out.println("Hello Java");
        //콘솔에도 출력할 수 있지만, 파일, db 에 보낼 수도 있고 GUI,다른 PC에도 보낼 수 있다.
        //out : 출력 스트림 (데이터가 이동되는 통로 정도로 생각하면 된다.)
        //실행을 하게 되면 JDK에서 컴파일을 하게 된다. (투 페이즈 컴파일)
        //오류 검사를 하고 나서 HelloJava.java 파일을  HelloJava.class 로 만든다.
        //각 os에 맞는 JVM 에서 구동되기 위하여 이런 번거로움을 거치는 것이다.

        //배열의 용도 장점: 데이터를 묶어서 전달하기 용이 하다. 데이터에 접근하기 용이해진다.
        //단점 :  동적메모리를 할당하기 때문에 메모리를 추가 할당했을 때 불필요한 공간을 잡아먹을 수 있다.

        //메모리에 기억 공간을  만드려면 크기와 종류가  정해져야한다.
        //종류 : 정수 실수 논리 등등 , 크기 : 바이트
        // 자료형은 : 종류와 크기 내용을 다 갖고 있다. ex) int :  정수 + 4바이트
        //기억 공간의 이름 == 변수

        //문자열은 자바에서 객체로 다룬다. String 이란 클래스
        // 문자열 String 은 기본 자료형이 아니라 자바에서 제공해주는 객체 자료형이다.
        // JDK 안에  1.JVM 탑재 2. 컴파일러 실행 명령어등 TOOL  3. 자바에서 제공하는 API
        // API 는 Class 들의 묶음이라 생각하면 된다. 패키지 단위로 배포했다. ex ) java.util.ArrayList
        String a = "apple";
        // 위에 간단히 쓴 표현식은 원래는
        java.lang.String b="apple"; //이렇게 써야한다.
        //자주 쓰는 java.lang 은 디폴트 패키지로 임포트 하는 곳에 생략되어 있다.
        //import java.lang.*;
        java.util.ArrayList list; // java.util.ArrayList 은 클래스의 풀네임(full name or qualified name)

        //변수 선언( 자료형 + 변수)
        //자바는 type 기반의 언어 int a; 파이썬은 데이터가 들어갈때 정해진다.
        int i; // 변수 선언 (자료형 + 변수)
        i=10; // 할당, 대입(=), 초기화
        //클래스란 새로운 자료형을 만드는(modeling) 도구

        //사용자가 필요에 의해 만들어 진 자료형 == 사용자 정의 자료형(User defined data type)
        //기본자료형 Primitive data type
        //uddt 에 들어가는 데이터 property는 서로 다르기 때문에 이질적이다. ex) 책 [제목(문자열) , 가격(정수) 등등]
        //배열에 들어가는 엘리멘트는 같은 자료형이 들어가야한다.

        kr.fc.model.BookVO book;
    }


}
