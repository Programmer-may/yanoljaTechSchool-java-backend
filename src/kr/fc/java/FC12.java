package kr.fc.java;

import kr.fc.model.Movie;

public class FC12 {
    public static void main(String[] args) {
        //영화 데이터 3편을 저장할 배열을 생성하시오
        Movie[] mv = new Movie[3];
        mv[0] = new Movie("범죄도시","마동석","롯데시네마",13000,15);
        mv[1] = new Movie("아바타","홍길동","메가박스",12000,12);
        mv[2] = new Movie("밀수","조인성","CGV",11000,17);

        //정렬 (선택, 버블, 퀵, 힙 ....)
        //다음은 선택 정렬 로직
        //가격 기준 오름차순으로 정렬해보기
        for (int i = 0; i < mv.length ;i++) {
            for (int j = i+1; j < mv.length; j++) {
                if (mv[i].getmPrice() > mv[j].getmPrice()) {
                    Movie temp = mv[i];
                    mv[i]=mv[j];
                    mv[j]= temp;
                }
            }
        }
        /*
        영화 이름으로 정렬
        for (int i = 0; i < mv.length ;i++) {
            for (int j = i+1; j < mv.length; j++) {
                if (mv[i].getmTitle().compareTo(mv[j].getmTitle())>0 ) {
                    Movie temp = mv[i];
                    mv[i]=mv[j];
                    mv[j]= temp;
                }
            }
        }
         */

        //출력
        for (Movie m : mv) {
            System.out.println(m); //m.toString
        }
    }
}
