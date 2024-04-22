package exam05;
//  인터페이스 클래스 다중 상속 예제
public class Ex01 {
    public static void main(String[] args) {
        C c = new C();
        // C타입의 참조변수 c로 C 객체를 생성하였으므로 C안에 구현된 메서드가 호출
        c.method();
    }
}
