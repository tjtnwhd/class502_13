package exam02;

public class A {  // 실제 클래스명 : exam02.A
       //   같은 패키지에서는 패키지명 생략 가능
    public int numA;// public 접근제어자 : 다른,( 모든 ) 패키지에서도 접근이 가능

  int numAA;  // default 접근제어자 : 동일 패키지에서만 접근 가능

  private int numAAA;  // private 접근제어자 : 클래스 내부에서만 접근 가능

  protected int numB;   //동일 패키지에서 접근 가능 (default)
                        // + 외부 패키지에 있는 클래스에서 상속을 받으면
                        //  클래스 내부에서 접근 가능(private) - default + 상속(private)


     void printNum(){
       numAAA = 100;
       System.out.println(numAAA);


     }

  }
