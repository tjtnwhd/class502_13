package exam01;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array = {20,30,15,99};
        System.out.println(Arrays.toString(array));
        int[] reversedArray = reverse(array);
        System.out.println("Reversed array:"+ Arrays.toString(reversedArray));
    }

static int[] reverse(int[] array){
    int[] newArray = new int[array.length];

    for(int i = 0; i < array.length; i++){
        newArray[array.length-1-i] = array[i];
    }
    return newArray;
}
}
