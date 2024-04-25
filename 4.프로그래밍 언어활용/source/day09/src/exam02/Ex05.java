package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 정규 표현식 패턴 예제
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자를 포함하여 입력: ");
        System.out.print("숫자만 입력: ");
        String str = sc.nextLine();

//        Pattern p1 = Pattern.compile("[0-9]");  //    [0123456789]
//        Pattern p1 = Pattern.compile("\\d");  //   \\d -> \d : 위와 동일

        Pattern p1 = Pattern.compile("[^0-9]");
        //                           [^0-9] : 부정 문자 클래스: 0~9 숫자가 아닌 문자만 가능
//        Pattern p1 = Pattern.compile("\\D");  //    \\D -> \D : 위와 동일

        Matcher m1 = p1.matcher(str);
//          if(!m1.find()){
//              System.out.println("숫자를 포함하여 입력하세요.");
//          }
        if(m1.find()){
            System.out.println("숫자만 입력하세요.");
        }
        }
    }

