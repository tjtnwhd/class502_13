package ex01;

import java.util.StringTokenizer;

//  java.util.StringTokenizer 클래스 사용 예제
public class Ex04 {
    public static void main(String[] args) {
        String fruits = "Apple#Orange,Melon_Bananan+Mango"; // #,_+ - Token(토큰)

        StringTokenizer st = new StringTokenizer(fruits,"#,_+");// 토큰이 여러개 일때
                  // 구문문자 #,_+(토큰)을 사용해 분해해서 실행

        while (st.hasMoreTokens()){
            String fruit = st.nextToken();
            System.out.println(fruit);
        }
    }
}
