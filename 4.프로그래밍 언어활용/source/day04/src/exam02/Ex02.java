package exam02;

public class  Ex02 {
    public Ex02(){

    }

    public static void main(String[] args) {
        B b = new C();
        b.numA = 11;

        C c = new C();
        c.numA = 12;
        A a = new C();
        System.out.println(a.numA);
        System.out.println(b.numA);
        System.out.println(c.numA);
//        A a = new C();
//        B b = new B();
//        System.out.println(a.numA);
//        System.out.println(b.numA);
//        System.out.println(c.numA);


    }
}
