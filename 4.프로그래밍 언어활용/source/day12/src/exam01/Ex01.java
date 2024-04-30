package exam01;

import java.util.ArrayList;
import java.util.Iterator;
 // Iterator : 반복자 패턴 인터페이스
public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1001,"책1","저자1"));
        books.add(new Book(1002,"책2","저자2"));
        books.add(new Book(1003,"책3","저자3"));
        books.add(new Book(1004,"책4","저자4"));
        books.add(new Book(1005,"책5","저자5"));

        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }
        iter = books.iterator();
        while (iter.hasNext()){
            Book book = iter.next();
            System.out.println(book);
        }
    }
}
