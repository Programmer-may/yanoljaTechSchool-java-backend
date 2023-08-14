package kr.fc.practice;

public class PolyGo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        go(a,b);
    }

    public static void go(A a, B b){
        a.display();
        b.display();
    }

}
