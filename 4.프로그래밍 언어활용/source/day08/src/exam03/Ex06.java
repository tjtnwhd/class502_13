package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = 100; // = Integer num1 = Integer.valueOf(100); // 오토박싱
        Integer num2 = 200;

        Integer result = num1 + num2;
//        Integer result2 = Integer.valueOf(num1.intValue()+num2.intValue());
          // Integer는 기본자료형이 아니다. Integer는 객체이다.
        double num3 = num1.doubleValue();
    }
}
