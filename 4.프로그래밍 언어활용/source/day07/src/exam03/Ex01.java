package exam03;
// 예외처리 : try-with-resources 사용 예제 (AutoCloseable 사용)
// 자원해제를 자동으로 해제해주는 기능 (가독성 등 여러 코드에서 유용하다.)
public class Ex01 {
    public static void main(String[] args) throws Exception {
        Resources res = new Resources();
        Resources2 res2 = new Resources2();
        try(res; res2) {
            // res 가 AutoCloseable 인터페이스 구현 객체인지 체크한다.
               // 맞으면 close() 메서드 자동 호출해준다.

            // 자동 해제 과정
            //AutoCloseable auto = res;
            //auto.close();

        } catch (Exception e) {
            e.printStackTrace();
            // AutoCloseable auto = res; // 자동 현변환을 해준다.
            // auto.close();
        }
    }
}