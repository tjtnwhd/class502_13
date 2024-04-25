package exam02;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        String str = "Apple Mango          Melon Banana";
        String[] fruit = str.split("\\s+");  // 공백 제거
        System.out.println(Arrays.toString(fruit));
    }
}
