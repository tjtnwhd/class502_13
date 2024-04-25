package ex01;
 // java.util.Scanner 클래스 사용 예제
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws FileNotFoundException { // 예외전가
        Scanner sc = new Scanner(new File("data.txt"));

        int total = 0;
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(num);
            total += num;
        }
        System.out.println(total);
    }
}
