package exam02;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
      //      다차원 배열 사용 예제
              int[][] nums = new int[2][4];
        nums[0][0] = 10;
        nums[0][1] = 20;
        nums[0][2] = 30;
        nums[0][3] = 40;

        nums[1][0] = 50;
        nums[1][1] = 60;
        nums[1][2] = 70;
        nums[1][3] = 80;


              System.out.println(Arrays.deepToString(nums));


    }
}
