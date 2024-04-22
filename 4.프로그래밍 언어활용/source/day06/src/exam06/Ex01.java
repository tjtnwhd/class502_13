package exam06;
   // 일반 클래스 단일 상속
public class Ex01 {
    public static void main(String[] args) {
        ClassC C = new ClassC();
//        C.method();
        // ClassA 와 ClassB에 동일한 인스턴스 메서드(method)가 구현이 되있어서
        // 어떤것을 호출해야 할지 모르니 다중상속 X, 단일상속만 가능
    }
}
