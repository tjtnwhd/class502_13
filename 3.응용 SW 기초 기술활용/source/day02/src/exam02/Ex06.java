package exam02;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        //        2차원 배열 사용 예제
        int[][] nums = {{10,20,30,40},{50,60,70,80}};
        System.out.println(nums);  // 주소값
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums.length);  //  행의 갯수
        System.out.println(nums[0].length);  // 열의 갯수
        System.out.println(nums[1].length);  // 열의 갯수

        for(int i =0; i < nums.length; i++){  // 행의 반복
            for(int j =0; j< nums[i].length; j++){
                System.out.println(nums[i][j]);  // i행,j열
            }
        }

//
    }
}
