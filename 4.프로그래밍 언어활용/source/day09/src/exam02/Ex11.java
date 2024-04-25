package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 정규 표현식 패턴 예제 ( ( 패턴 ) : 그룹핑 )
public class Ex11 {
    public static void main(String[] args) {
        String str = "ABCABCABC";
//        Pattern p1 = Pattern.compile("ABC{3}");
                                     // ABCCC : C가 3번이상 반복될떄  /  ABC 반복체크 X
        Pattern p1 = Pattern.compile("(ABC){3}"); // 그룹핑 / ABCABCABC 랩핑 O
        Matcher m1 = p1.matcher(str);
        if(m1.find()){
            System.out.println(m1.group());
        }
    }
}
