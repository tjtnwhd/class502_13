package ex01;
// java.util.Scanner 클래스 사용 예제
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 터미널에서 입력, 커서 블록 생성
        System.out.print("이름을 입력하세요.");
        String name = sc.nextLine(); //  터미널에서 입력한 값이 name으로 들어간다.
        System.out.printf("이름: %s%n",name);

    }
}
