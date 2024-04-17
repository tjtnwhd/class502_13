package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule(2024,3,20);

        System.out.println(s1.toString());  // s1.toString(); 생략됨 -> 멤버 변수의 값을 확인하는 용도로 재정의
        System.out.println(s1);  // 객체 16진수 ( 3b07d329 ),
        System.out.println(System.identityHashCode(s1));  // 객체 10진수 ( 990368553 )
    }

}
