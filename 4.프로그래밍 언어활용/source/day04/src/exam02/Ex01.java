package exam02;

public class Ex01 {

    public static void main(String[] args) {
       B b = new B();
        A a = new A();
        System.out.println(a.numA);


        A ab = new B(); // 다형성
        System.out.println(ab.numA);
    }
}
