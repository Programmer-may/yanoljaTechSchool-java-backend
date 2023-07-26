package kr.fc.java;

public class FC11 {
    public static void main(String[] args) {
        // 자바에서 문자열 처리 -> 객체로 취급
        String st = "apple";
        //"apple" -> 문자열 상수 , 리터럴
        // " " 감싸면 객체로 인식하여 객체를 생성하여 참조를 변수에 저장한다.
        // 리터럴풀에 문자열 상수가 올라간다.


        String s1 = new String("apple");
        //이는  "apple" 객체를 리터럴풀이 아닌 힙 area 에 로딩된다.

        //길이
        System.out.println(st.length());

        // 모두 소문자 출력
        System.out.println(st.toLowerCase());

        // "pl" 이라는 부분 문자열만 출력
        System.out.println(st.substring(2,4)); //2~3 이라고 하면 1글자 밖에 못가져 온다.


        String s2 ="바나나#오렌지#포도#귤";

        //#을 기준으로 잘라서 문자열 출력
        String[] sp = s2.split("#"); // regex : 정규식
        for (String ss : sp) {
            System.out.println(ss);
        }

        //문자열의 비교
        String str1 ="APPLE";
        String str2 ="blue";

        // 두 문자열이 같은지 다른지
        str1.equals(str2);

        //두 문자열 의 크다/작다 비교
        int cmp= str1.compareTo(str2);
        // 음수가 나왔다. -> ()안에 데이터가 더 크다. str2
        //0이 나왔다 -> 같다.
        //양수가 나왔다. 비교 대상이 더 크다. str1



    }
}
