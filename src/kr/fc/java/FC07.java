package kr.fc.java;

import java.util.Arrays;

public class FC07 {
    public static void main(String[] args) {
        // 행과 열을 가지고 있는 2차원 배열 생성, 2행 3열

        int[][] arr = new int[2][3];
        // 자바에선 메모리 할당 정책으로 row major 정책으로 메모리에 일렬로 행순으로 구성된다.
        // 00 01 02 10 11 12

        //모든 원소에 10을 저장하시오
        for(int i=0 ; i<arr.length; i++){
            for(int j=0;j<arr[i].length;i++){
                arr[i][j]=10;
            }
        }
        /*
        for(int i=0; i<arr.length;i++){
            Arrays.fill(arr[i],10);
        }
        */

    }
    
}
