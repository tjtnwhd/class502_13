package exam02;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
                //   배열 선언과 초기화
//        int[] nums = new int[] {10, 20, 30, 40};  // new int[] - 생략가능
            int[] nums = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("공간의 갯수 : " + nums.length);
                for(int i=0; i < nums.length; i++){
                 System.out.println(nums[i]);
        }
//        System.out.println(Arrays.toString(nums));
    }
}
