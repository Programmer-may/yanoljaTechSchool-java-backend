package kr.fc.java;

public class FC03 {
    public static void main(String[] args) {
        //변수는 데이터를 1개의 형태로 저장한다.
        //[정수][3개]를 저장할 [변수를 선언]하시오
        int[] nums;
        //3개의 정수를 저장할 수 있는 [배열을 생성]하시오
        nums=new int[3];
        //반복문 활용하여 총합구하기
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
    }
}
