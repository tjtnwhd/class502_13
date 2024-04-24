package exam01;

import java.util.HashSet;
  // 집합자료  ( 중복 제거 )
public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> data = new HashSet<>();
        data.add("AAA");
        data.add("BBB");
        data.add("AAA");  // 중복 제거
        data.add("CCC");
        System.out.println(data);

//        기존에 동등한 가치가 있으면 추가 X
    }
}
