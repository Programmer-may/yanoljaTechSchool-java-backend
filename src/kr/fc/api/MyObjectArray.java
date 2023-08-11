package kr.fc.api;

public class MyObjectArray { //용량체크, 늘리기, 삭제, 클리어
    // 객체를 여러개 저장하는 변수
    private Object[] arr;
    private int cnt;
    public MyObjectArray(){
        this(10); //자기자신의 매개변수가 한개인 메소드 호출
    }
    public MyObjectArray(int initialSize){
        arr = new Object[initialSize];
    }
    public void add(Object data){
        arr[cnt++]=data;
    }
    public int size(){
        return this.cnt;
    }
    public Object get(int index){
        return arr[index];
    }
}
