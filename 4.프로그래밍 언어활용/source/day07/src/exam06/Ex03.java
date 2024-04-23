package exam06;

public class Ex03 {
    public static void main(String[] args) {
        Book b1 = new Book(1000,"책1","저자1");
          Book b2 = new Book(1000,"책1","저자");
        System.out.printf("b1 == b2 : %s%n",b1==b2);
        System.out.printf("b1.equals(b2) : %s%n",b1.equals(b2));
//        ==, equals : 동일성 비교 (주소 비교)
        // 내용이 같아도 다른 객체라 주소값이 다름

    }
}
