package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 정규 표현식 패턴 예제 ( | | | )
public class Ex10 {
    public static void main(String[] args) {
//        String str = "cat|dog|pig";
//        String str = "I like a cat";
//        String str = "I like a dog";
        String str = "I like a pig";
        Pattern p1 = Pattern.compile("cat|dog|pig");
        Matcher m1 = p1.matcher(str);
        if(m1.find()){
            System.out.println(m1.group());
        }
    }
}
