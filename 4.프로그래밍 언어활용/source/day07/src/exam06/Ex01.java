package exam06;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book(1000,"책1","저자");
        // isbn=1000,title=책1,author=저자 : toString 메서드 재정의

        System.out.println(book);
        Class cls = Book.class;  // 클래스 구성 정보
        Class cls2 = book.getClass();
        // 구성 정보가 담겨져 있는 객체,시스템이 자동 생성
    }
}
