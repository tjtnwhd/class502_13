package exam11;
//          정적 내부 클래스 사용 예제
public class Outer {
    int num = 1;  // 인스턴스는 객체와 관련 O
    static int num1 = 5; // 정적(static)은 객체와 관련 X

    static class Inner{  // 정적 내부 클래스
        public void method(){
            // 정적인 메서드는 this가 없어서 객체가 안된다.
            System.out.println("정적 내부 클래스에서 호출");
//            System.out.println(Outer.num); 사용불가 (접근 불가)
            // Outer 클래스의 객체가 되든 관련 없다.
            System.out.println("num1 = "+num1);
        }
    }
}
