package kr.fc.java;

import java.util.stream.IntStream;

public class FC06 {
    public static void main(String[] args) {
        // 메인 메소드는 왜 static이 붙어야할까?
        // 프로그램 시작 시에 메모리에 올라가 있어야하기 때문이다.
        //JVM에서 메소드 area 는 크게 2개로 나뉜다. static zone, none-static zone
        // 메소드가 메서드 area에 구분될때 클래스 명을 레이블로 갖는다. (like tag)

        //3개의 정수 (10,20,30) 을 배열에 초기화 하시오 => { }
        int[] arr ={10,20,30};
        int v = FC06.arrSum(arr); // 매개 변수 전달 기법  : 번지전달 call by reference
        System.out.println(v);
        System.out.println(FC06.sum(arr));
    }
    //배열의 원소들의 합을 구하는 매소드 만들기
    //case 1
    public static int arrSum(int[] arr){
        int result =0;
        for(int i =0; i<arr.length;i++){
            result+=arr[i];
        }
        //확장된 for 문 사용
        /* for(int n :arr){
        result +=n;
        }*/
        return result;
    }
    //case 2 - stream 사용
    static  int sum (int... nums){
        return IntStream.of(nums).sum();
    }
}
