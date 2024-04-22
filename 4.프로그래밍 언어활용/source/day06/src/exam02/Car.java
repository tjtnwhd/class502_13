package exam02;

    // 조상클래스 앞에 final 사용하면 자손클래스 상속 불가
 public abstract class Car {
     public abstract void start();
     public abstract void press();
     public abstract void turnOff();


    final public void run(){  // 템플릿 메서드 (디자인 패턴)
      // 틀을 정해서 순서가 바뀌지 않게 실행해야 한다.final(순서를 정해놓은것,변경불가)
     start();
     press();
     turnOff();
    }
}

