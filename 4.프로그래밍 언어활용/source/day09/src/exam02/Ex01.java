package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  정규 표현식 사용 예제 ( java.util.regex.(Pattern),(Matcher))
public class Ex01 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java"); // 패턴 객체 생성
        Matcher m1 = p1.matcher(str);  // 패턴의 일치 여부 체크, 일치하는 문자열 추출
        System.out.println(m1.find());  // java
        System.out.println(m1.group());  // 패턴에 일치하는 문자열

        System.out.println(m1.find());  // javascript
        System.out.println(m1.group());

        System.out.println(m1.find());  // false

    }
}
