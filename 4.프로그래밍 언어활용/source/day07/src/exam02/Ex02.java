package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// 예외 처리 사용 예제
//       예외처리 사용 이유 : 서비스 중단을 막기 위해
public class Ex02 {
    public static void main(String[] args) {
        // Throw new FileNotFoundException(...)
        try{
    FileInputStream fis = new FileInputStream("b.txt"); // 오류 발생 위치
 System.out.println("파일 처리"); // 예외 발생하면 실행이 안되고 catch쪽으로 던져진다.
        } catch(FileNotFoundException e){// e = new FileNotFound.. 대입된다.
            System.out.println("예외 발생!");

//            오류를 확인 해볼수 있는 메서드(getMessage, printStackTrace 등)
//     String message = e.getMessage(); // 파일 경로가 잘못되었으면 알수 있다.(조회)
//            System.out.println(message);

            e.printStackTrace(); // 발생한 위치부터 파생된 위치까지 알려준다.
//      at exam02.Ex02.main(Ex02.java:11) : 오류가 발생한 처음 위치
 //              (Ex02.java:11) : 발생 위치 확인 가능


        }
        System.out.println("매우 중요한 살행 코드!");
        }
}
