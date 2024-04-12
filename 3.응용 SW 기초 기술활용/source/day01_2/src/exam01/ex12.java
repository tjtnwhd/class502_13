package exam01;

public class ex12 {
    public static void main(String[] args) {
        int num1 = 13;
        double num2 = 3.6;
        int num3 = num1 * (int)num2;  // X

        int num4 = (int)(num1 * num2); // O

        double num5 = num1 * num2;
        // 곱셈 결과를 정수로 표현
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);

    }
}
