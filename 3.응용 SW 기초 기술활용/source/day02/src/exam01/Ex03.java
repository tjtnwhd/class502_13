package exam01;

public class Ex03 {
    public static void main(String[] args) {
        // 3항 연산자 사용 예제
        int num = 10;
        String str = num % 2 == 0 ? "짝수" : "홀수";
//        String str = num % 3 == 0 ? "짝수" : "홀수";
                     //   1항         2항     3항
        System.out.println(str);
        
    }
}
