package exam01;

public class ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        num1 = 20;
        final int num2 = 30;  // 상수 , 대문자 사용(관례) 또는 _
//        int num2 = 20;
        final int NUM3;
        NUM3 = 50; // final 최초 한번만 대입 가능
//            num3 = 70; // 변경 불가
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(NUM3);
    }
}
