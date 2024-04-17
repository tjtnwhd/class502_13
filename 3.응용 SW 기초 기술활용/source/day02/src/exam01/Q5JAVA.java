package exam01;

import java.util.Arrays;

public class Q5JAVA {
    public static void main(String[] args) {
        int[] nums = {21,22,30,11,99,31};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(reverseArray(nums)));
    }



    private static int[] reverseArray(int[] arr){
        int start=0, end = arr.length -1,temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return arr;
    }
}
