package exam02;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
           // 배열 예제
        int[] studentIds = new int[99];   // int 형 변수 99개 생성 - 동일 자료형
        studentIds[1] = 5;
        System.out.println(studentIds[1]);
        System.out.println(Arrays.toString(studentIds));

    }
}
