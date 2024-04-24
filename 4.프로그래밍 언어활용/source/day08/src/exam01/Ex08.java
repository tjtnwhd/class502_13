package exam01;

import java.util.Arrays;
 // 가변적 형태의 변수 사용
public class Ex08 {
    public static void main(String[] args) {
        int result1 = sum(10,20,30,40);
        int result2 = sum(10,20);
        System.out.println(result1);
        System.out.println(result2);

    }
    public static int sum(int...nums){ // 자료형 앞에 ... 가변적인 형태
        int total = 0;
        for(int num : nums){
            total += num;
        }
        return total;
    }
}
