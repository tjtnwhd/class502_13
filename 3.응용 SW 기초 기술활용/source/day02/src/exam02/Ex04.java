package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {

        String[] strs = {"가나","다라","마바"};
                // 향산된 for 문 사용 예제
        for (String str : strs){
            System.out.println(str);
        }
        Arrays.stream(strs).forEach(System.out::println);
//
//        System.out.println(strs.length);
//        System.out.println(Arrays.toString(strs));
    }
}
