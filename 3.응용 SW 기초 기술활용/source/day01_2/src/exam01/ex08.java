package exam01;

public class ex08 {
    public static void main(String[] args) {
        byte num1 = 100;  // int -> byte

        int num2 = num1;  // 자동 형변환 / 묵시적 형변환

        long num3 = num2; // 자동 형변환 / 묵시적 형변환

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
