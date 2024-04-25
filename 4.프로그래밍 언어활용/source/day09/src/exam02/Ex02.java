package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "java";

        Pattern p1 = Pattern.compile(".*java.*");
        Matcher m1 = p1.matcher(str);
        boolean match = m1.matches(); // 정확한 패턴을 일치해야지 true
        System.out.println(match);

    }
}
