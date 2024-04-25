package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "AAA\n1234\nBBBB\n456\nCCCCC\nDDDDDDDD";  // \n 줄개행: 문자 포함 X
           // 4글자로 구성된 단어
//     Pattern p1 = Pattern.compile("\\b....\\b"); // ( . 문자 한개를 의미,공백도 포함)
//        Pattern p1 = Pattern.compile("\\b.{4}\\b");// {} : 앞에 .을 중복하는 숫자
//        Pattern p1 = Pattern.compile("\\b.{4,}\\b"); //{4,} : 문자 4개 이상
//        Pattern p1 = Pattern.compile("\\b.{4,5}\\b"); // {4,5}:시작,종료횟수
        Pattern p1 = Pattern.compile("\\b.{1,4}\\b");
        Matcher m1 = p1.matcher(str);

        while (m1.find()){
            System.out.println(m1.group());
        }

//        if(m1.find()){
//            System.out.println(m1.group()); //1234
//        }
//        if(m1.find()){
//            System.out.println(m1.group()); // BBBB
//        }
    }
}
