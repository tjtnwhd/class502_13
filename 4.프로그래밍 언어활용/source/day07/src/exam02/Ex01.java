package exam02;
  //  예외 처리 사용 예제 , RuntimeException,Exception (다형성)
// Runtime이 없으면 컴파일러가 체크, 있으면 실행 과정중에 체크
//  유연한 예외
public class Ex01 {
    public static void main(String[] args) {
       try {
           int num1 = 10;
           int num2 = 2;
           int result = num1 / num2; // 오류 발생 위치
//           ArithmeticException 오류 발생

           String str = null;
           System.out.println(str.toUpperCase());// 소문자를 대문자로 변환
            // NullPointerException 오류 발생

       }catch (ArithmeticException e){
           e.printStackTrace(); // 자세한 오류 정보를 확인 가능
       }catch (Exception e){
        // 예외메서드를 잘 모를때 다형성 이용해서 조상인 Exception을 이용한다.
        // Exception e = new NullPointer.. 다형성 가능
       // 다형성으로 Exception만 사용하면 안될까? -> 처리를 달리할때는 사용 불가
        //  catch를 달리할때 다형성 X, catch를 여러개 정의할떄 다형성 O
           System.out.println("유입");
           e.printStackTrace(); // 자세한 오류 정보를 확인 가능

       }
       // 예) 위에 예외가 발생했을때 밑에 코드들이 실행 X
        //    서비스 중단, 멈춘다.
        // 예외처리 목적 : 서비스는 계속 실행되야한다.

//        System.out.println(result);
        System.out.println("매우 중요한 실행코드...");

    }
}
