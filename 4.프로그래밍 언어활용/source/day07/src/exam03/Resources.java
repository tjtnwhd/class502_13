package exam03;
// 예외처리 :  try-with-resources문 사용 예제 (AutoCloseable 사용)
public class Resources implements AutoCloseable{
     // AutoCloseable interface : 기준
     @Override
     public void close() throws Exception {
         System.out.println("자원해제!");
     }
 }
