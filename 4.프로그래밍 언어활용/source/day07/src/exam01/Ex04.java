package exam01;

public class Ex04 {
    public static void main(String[] args) {
        // 상속하지 않아도 객체 생성시 바로 재정의가 가능 하다.{} - 활용
        A a = new A(){
         public void method(){
             System.out.println("재정의된 메서드!");
         }
        };
        a.method();
    }
}
