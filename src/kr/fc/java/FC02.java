package kr.fc.java;

public class FC02 {
    public static void main(String[] args) {
        String title = "자바책";
        int price =35000;
        print(title,price);
    }
    //메소드 정의
    public static void print(String title,int price){
        System.out.println("제목:"+title+"값:"+price);
    }
    //두개를 개별로 파라미터로 보내는거 보다 하나로 묶어서 보내는게 유용하기 때문에
    // DTO 클래스가 필요하다.
}
