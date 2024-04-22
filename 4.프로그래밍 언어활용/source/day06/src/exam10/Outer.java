package exam10;
  // 인스턴스 내부 클래스 사용 예제
public class Outer {
    // Outer가 객체가 되어야지만 inner클래스를 사용(접근) 가능
        int num1 = 10;

    class Inner {  // 인스턴스 내부 클래스
        int num1 = 15;
        int num2 = 20;
    static int num3 = 11;  // jdk 16버전 이상부터는 static 정적 변수 사용 가능

          public void method(){
              System.out.println("인스턴스 내부클래스에서 호출");
              System.out.printf("num1 + num2 = %d%n",Outer.this.num1+num2);
          }
    }
}
