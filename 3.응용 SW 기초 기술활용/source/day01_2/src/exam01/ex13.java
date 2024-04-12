package exam01;

public class ex13 {

    public static void main(String[] args) {
        int num1 = 10;
        double num2 = 2.5;
        double num3 = num1 * num2;  // 연산은 무조건 같은 자료형 끼리만 가능  int num1 -> double
        int num4 = num1 * (int)num2;
        System.out.println(num3);
        System.out.println(num4);
    }
}
