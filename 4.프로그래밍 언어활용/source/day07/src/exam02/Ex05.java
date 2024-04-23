package exam02;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")){
     // AutoCloseable의 구현체인가 FileInputStream를 확인하고,
//   자동해제 과정 : 형변환하고 내부적으로 close()를 자동 호출
//            AutoCloseable auto = fis; // 조상, 다형성(유연성)
//            auto.close();
        }catch (IOException e){
         e.printStackTrace();
        }
    }
}
