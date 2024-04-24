package exam03;

public class Ex02 {
    public static void main(String[] args) {
        // Wrapper 클래스 객체
        Integer num1 = new Integer(10);  //Integer의 생성자 사용 안하는게 좋다.
        Integer num2 = new Integer(10);
        System.out.printf("num1 주소 : %d%n",System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n",System.identityHashCode(num2));

    }
}
