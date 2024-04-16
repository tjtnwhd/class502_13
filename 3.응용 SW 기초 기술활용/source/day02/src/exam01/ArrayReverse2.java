package exam01;

import java.util.Arrays;

public class ArrayReverse2 {
    //저도 찾아보다가  temp 를 사용해서 만드는 방법도 있다고 해서 올려드려요~
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
