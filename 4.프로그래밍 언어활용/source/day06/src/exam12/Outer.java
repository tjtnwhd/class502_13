package exam12;
  // 지역 내부 클래스 사용 예제, 권장 X
public class Outer {
    public void method(){
        class Inner {
            public void method(){
                System.out.println("지역 내부클래스에서 호출");
            }
        }
        Inner inner = new Inner();
        inner.method();
    }
}
