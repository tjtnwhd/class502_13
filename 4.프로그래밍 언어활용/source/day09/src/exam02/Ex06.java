package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 정규 표현식 패턴 예제
public class Ex06 {
    public static void main(String[] args) {
        String str = "java I like java and javascript";
        Pattern p1 = Pattern.compile("\\bjava\\b"); //javascript - java 출력 X
//        Pattern p1 = Pattern.compile("\\bjava\\B"); // javascript - java만 출력 O
        Matcher m1 = p1.matcher(str);
        if(m1.find()){
            System.out.println(m1.group()); // 첫번째 java 매칭
        }
        if(m1.find()){
            System.out.println(m1.group()); // 두번째 java 매칭
        }
        if(m1.find()){
            System.out.println(m1.group());
        }
    }
}
