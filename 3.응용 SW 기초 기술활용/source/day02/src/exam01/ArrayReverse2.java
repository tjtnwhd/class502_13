package exam01;

import java.util.Arrays;

public class ArrayReverse2 {
    public static void main(String[] args) {
        int[] array = {20,30,15,99};
        System.out.println("정배치 : "+Arrays.toString(array));
        System.out.println("역배치 : "+Arrays.toString(reverseArray(array)));
    }

static int[] reverseArray(int[] arr){
        int start =0, end = arr.length -1, temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
return arr;
    }




}
