package kr.fc.java;

public class FC40 {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        memberService.welcome("Kim");
        //AppConfig 마저도 객체를 생성하지 않으려면 스프링이 필요하다.
    }
}
