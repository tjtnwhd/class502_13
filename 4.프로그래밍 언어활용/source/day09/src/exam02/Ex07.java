package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규 표현식 패턴 예제
public class Ex07 {
    public static void main(String[] args) {
        String str = "java one\njava two\njava three"; //
//        System.out.println(str);
//        Pattern p1 = Pattern.compile("^\\w+\\s"); // 단어 한개, 공백 문자 한개
                                                      //   + : 패턴을 1번 이상 반복
        Pattern p1 = Pattern.compile("^\\w+\\s",Pattern.MULTILINE);
                                       // 여러줄에 걸쳐 패턴 체크 : 각각의 문장으로 인식

        Matcher m1 = p1.matcher(str);
        if(m1.find()){
            System.out.println(m1.group()); // 첫번째 java - a,공백
        }
        if(m1.find()){
            System.out.println(m1.group()); // 두번째 java - a,공백
        }
        if(m1.find()){
            System.out.println(m1.group()); // 세번째 java - a,공백
        }
    }
}
