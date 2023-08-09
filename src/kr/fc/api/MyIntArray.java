package kr.fc.api;

public class MyIntArray {
    // 정수를 여러개 저장하는 변수
    private int[] arr;
    private int cnt;
    public MyIntArray(){
        this(10); //자기자신의 매개변수가 한개인 메소드 호출
    }
    public MyIntArray(int initialSize){
        arr = new int[initialSize];
    }
    public void add(int data){
        arr[cnt++]=data;
    }
    public int size(){
        return this.cnt;
    }
    public int get(int index){
        return arr[index];
    }
}
