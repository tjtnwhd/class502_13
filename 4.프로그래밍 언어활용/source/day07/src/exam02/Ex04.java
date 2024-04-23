package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//  예외 처리 사용 예제( finally )
public class Ex04 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try{
             fis = new FileInputStream("a.txt");
            fis.close();  // * 중요 *, 자원 해제(안하면 서버 다운 발생)
            System.out.println("자원헤제 완료!");

        }catch(IOException e){ // FileNotFoundException - 다형성 가능
            e.printStackTrace();
            if(fis != null){
                try{
                    fis.close(); //예외가 발생하지 않아도 닫아줘야한다.
                }catch (IOException e2){

                }
            }
            // 애플리케이션 종료시 사라진다.하지만 서버는 24시 항상 돌아가야된다.
    // 메모리 낭비를 하지 않기 위해 자원을 소비하지 않을때는 닫아준다.(close())

        }finally {
            System.out.println("무조건 실행!");
            // 예외가 발생하든,안하든 finally는 무조건 실행 가능하다.
        }

    }
}
