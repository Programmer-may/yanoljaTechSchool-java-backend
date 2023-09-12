package kr.fc.java;

public enum Gender {
    MALE,
    FEMALE
}
// 우리가 자바에서 흔히 상수를 정의 할때 final static String 와 같은 방식으로 정의를 한다.
// 하지만 이렇게 코딩했을시 발생하는 문제점이 있다.
/*
public class EnumExample {
	// 기존에 상수를 정의하는 방법
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExample.MALE;
		gender1 = EnumExample.FEMALE;
		// MALE, FEMALE이 아닌 상수 값이 할당 될 때 //컴파일시 에러가 나지 않음. -> 문제점 발생.
		gender1 = "boy";
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMAL;
		// 컴파일 시 의도하지 않는 상수 값을 체크할 수 있음.
		// Enum으로 정의한 상수값만 할당 받을 수 있음.
		gender2 = "boy";

		따로 우리가 기대하는 상수값이 할당되었는지 안되었는지에 대한 유효성을 검사하는 로직이 들어가 있지 않다면,

        런타임시 문제가 발생할 것이고, 우리가 원치않은 상수값이 애당초 할당되었기 때문에 엉뚱한 결과값을 얻을 수 있다.
        이러한 문제가 발생하는 것은 자바 컴파일시 문제점을 발견할 수 없기 때문이다.

        자바입장에서는 String이라는 타입에 String 값이 할당되었기 때문에 이상하지 않다.

        만약 상수가 무수히 많고 복잡하다면, 이 잠재적인 문제는 프로그램의 치명적인  오작동을 초래할 수 있다.
	}
}

 */