package exam04;
              // Math 클래스의 관련 편의 기능

import static java.lang.Math.*;  // Math 함수 사용할때 정적인 함수 한정에서 Math 생략 가능
public class Ex01 {              // 효율성을 위해서
    public static void main(String[] args) {
        System.out.println(abs(-10)); // 음수 -> 양수 (10) / Math. 생략
        System.out.println(Math.ceil(10.2)); // 올림 (11)
        System.out.println(Math.floor(10.2)); // 버림 (10)
        System.out.println(Math.round(10.5)); // 반올림 (11)
        System.out.println(Math.pow(2,4)); // 제곱 (16)
        System.out.println(sqrt(9)); // 루트 (3)   / Math. 생략
    }
}
