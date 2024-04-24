package exam04;

import java.util.Arrays;

// Math 클래스의 관련 편의 기능, random 사용 예제 // 0 ~ 1  / 난수
public class Ex02 {
    public static void main(String[] args) {
        // 1 ~ 43, 6개 숫자 - 중복 X (로또 번호)
        int cnt = 0;
        int[] looto = new int[6];

        while (cnt< 6){
            int num = getNumber();
            if(chkDuplicated(looto, num)){
                continue;
            }
            looto[cnt] = num;
              cnt++;
        }
        System.out.println(Arrays.toString(looto));
    }

    public static int getNumber(){
        return (int)(Math.random()*43)+1;
    }
  public static boolean chkDuplicated(int[] looto,int num){
      // 중복 숫자 제거 메서드
              for(int n : looto){
                if(n == num) return true;
            }
                    return false;
  }

}
