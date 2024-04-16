package exam02;

public class Ex02 {
    public static void main(String[] args) {
//        접근 제어자 default 예제 (같은 패키지)
        A a = new A();

        a.numAA = 20;
        System.out.println(a.numAA);

        a.numB = 50;
        a.printNum();
    }
}
