package exam01;

//  * 추상 메서드의 역할 : 하위 클래스가 따라야 할 설계 원칙 *
public abstract class Calculator {
    int num = 10;
    public Calculator(){
        System.out.println("기본생성자");
    }
    public abstract int add(int num1, int num2);
    // 자손클래스는 무소건 add(메서드 또는 함수)를 구현해야 사용 가능하다.

    final public void commonMethod(){}
    // 조상메서드에서 final 사용하면 자손 메서드에서 정의 불가
}
