package kr.fc.practice;

public class practice01 {
    public static void main(String[] args) {
        /*
        **문제 01**
        char a = '1';
        char b = '1';
        a+b의 결과가 2가 되도록 프로그래밍하세요.
         */
        char a='1';
        char b='1';
        // System.out.println(a+b);
        //System.out.println((int)a+(int)b);
        // 이런 식으로 더하면 1의 아스키 코드 값과 1의 아스키 코드 값이 더해져서 98이 나온다.
        System.out.println((a-48)+(b-48)); //방법 1. 아스키 코드 값의 차이만큼을 뺀다.

        if(a=='1'){
            a=1;
        }
        if(b=='1'){
            b=1;
        }
        System.out.println(a+b); // 방법 2. 값을 재할당한다.


        /*
        **문제 02**
        char upper= 'A';
        upper의 값을 출력하면 소문자(lower) 'a' 가 출력되도록 프로그래밍하세요
        */
        char upper='A';

        System.out.println((char)(upper+32)); // 아스키 코드 값의 차이 만큼 더한다.

        /*
        **문제 03**
        int a = 10;
        int b = 20;
        a와 b의 값을 교환(swap)하여 출력하도록 프로그래밍하세요.
         */
        int A =10;
        int B =20;
        A=20; //재할당 해버리는 방법
        B=10;
        System.out.println("A :"+A+" B : "+B);

        /*
        **문제 04**
        아래 두 변수의 값을 더하여 최종 정수 값(53)을 출력하도록 프로그래밍하세요.
        int numInt = 50;
        double numDouble = 3.14;
         */
        int numInt = 50;
        double numDouble = 3.14;
        System.out.println((int)(numInt+numDouble)); // 형변환 해준다.


    }
}
