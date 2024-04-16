package 같은패키지;

import 다른패키지.B;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        a.defaultNum = 10;
        a.publicNum = 11;
        a.protectedNum = 12;
        System.out.println("default 접근제어자"+a.defaultNum);
        System.out.println("public 접근제어자"+a.publicNum);
        System.out.println("protected 접근제어자"+a.publicNum);
    }
}
