package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 전방 탐색 패턴 예제
public class Ex14 {
    public static void main(String[] args) {

        String str1 = "https://www.naver.com";
        String str2 = "ftp://www.naver.com";

        Pattern p1 = Pattern.compile("\\w*(?=:)");
        Matcher m1 = p1.matcher(str2);
        if(m1.find()){
            System.out.println(m1.group());
        }
    }
}
