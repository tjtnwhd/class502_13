package exam11;

public class Ex01 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.method();
        Outer outer = new Outer();
        System.out.println("num ="+outer.num);

    }
}
