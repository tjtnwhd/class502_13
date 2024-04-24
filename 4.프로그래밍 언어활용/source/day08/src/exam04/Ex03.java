package exam04;

import java.util.HashSet;

// Math 클래스의 관련 편의 기능, random 사용 예제 / set 사용 / 0 ~ 1  / 난수
public class Ex03 {
    public static void main(String[] args) {
        // set 중복 X
        HashSet<Integer> lotto = new HashSet<>();
        while(lotto.size() < 6){
            lotto.add(getNumber());
        }
        System.out.println(lotto);
    }

    public static int getNumber(){
        return (int)(Math.random()*43)+1;
    }
}
