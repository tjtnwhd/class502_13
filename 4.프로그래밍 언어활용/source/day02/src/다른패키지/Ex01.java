package 다른패키지;

import 같은패키지.A;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.publicNum =10;
        System.out.println("public 접근제어자"+a.publicNum);
    }
}
