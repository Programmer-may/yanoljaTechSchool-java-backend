package kr.fc.java;

import kr.fc.api.MyIntArray;

public class FC24 {
    public static void main(String[] args) {
        // 정수형 배열처럼 동작하는 API 설계
        // 1. 배열 생성하는 동작 : 생성자
        // 2. 배열에 데이터를 저장하는 동작 add()
        // 3. 배열의 크기를 얻어오는 동작 : size()
        // 4. 배열의 원소의 데이터를 가져오는 동작 : get()

        MyIntArray arr = new MyIntArray(5);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        for (int i =0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
