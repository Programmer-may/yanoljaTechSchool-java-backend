package kr.fc.java;

import kr.fc.model.Movie;

import java.util.Arrays;

public class FC13 {
    public static void main(String[] args) {
        //영화 데이터 3편을 저장할 배열을 생성하시오
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("밀수", "조인성", "롯데시네마", 13000, 15);
        mv[1] = new Movie("범죄도시", "마동석", "메가박스", 12000, 12);
        mv[2] = new Movie("아바타", "잭", "CGV", 11000, 17);

        //검색(Search) : 순차검색, 블럭 검색, 이진검색

        /*
        // 순차 검색
        //밀수라는 영화의 가격을 출력하기
        String mTitle ="밀수";
        int index = -1; //실패
        for (int i =0; i < mv.length; i++){
            if (mv[i].getmTitle().equals(mTitle)) {
                index=i;
            }
        }
        if (index != -1) {
            System.out.println(mv[index].getmPrice());
        } else {
            System.out.println("검색실패");
        }

         */

        //이진 검색 - 정렬된 상태에서 해야만 한다.
        String mTitle = "범죄도시";

        int index = -1; //실패
        int low=0;
        int high= mv.length-1;
        int middle;
        while (low <= high) {
            middle =(low+high) / 2;
            if (mv[middle].getmTitle().compareTo(mTitle)==0) {
                index=middle; //검색 성공
                break;
            } else if (mv[middle].getmTitle().compareTo(mTitle) < 0) {
                low = middle+1; //찾고자 하는 값이 오른쪽에 있을 때
            } else {
                high =middle-1; //찾고자 하는 값이 왼쪽에 있을때
            }
        }
        if (index != -1) {
            System.out.println(mv[index].getmPrice());
        } else {
            System.out.println("검색실패");
        }
    }
}