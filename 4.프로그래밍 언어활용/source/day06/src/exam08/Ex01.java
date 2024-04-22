package exam08;
 //  X,Y를 다중상속 받고있는 Z를 구현할때
 //  상속되어있는 하위클래스들의 모든 구현부들을
//  사용 안하더라도 빈({})공간을 만들어 구현부를 작성 해줘야지만 사용 가능하다.

public class Ex01 implements Z{
    @Override
    public void method() {
        System.out.println("Ex01에서 호출");

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {
    }
}
