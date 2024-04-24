package exam01;

public class Ex03 {
    public static void main(String[] args) {
        // 서로 다른 객체 주소가 다름
        Book b1 = new Book(1000,"책1","저자1");
        Book b2 = new Book(1000,"책1","저자1");
        System.out.printf("b1 == b2 %s%n",b1 == b2);
        System.out.printf("b1 equals(b2) : %s%n",b1.equals(b2));
        // Object의 - equals(..) : 동등성 비교 재정의

        System.out.printf("b1주소 : %d%n",System.identityHashCode(b1));
        System.out.printf("b2주소 : %d%n",System.identityHashCode(b2));


    }
}
