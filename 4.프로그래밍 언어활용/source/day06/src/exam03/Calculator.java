package exam03;
// interface : 설계 틀 작성하는 클래스
public interface Calculator {
    // interface 목적 : 구현 (inplements) 설계,틀 (통일성 개발을 위해 API),구현은 자신이 하는것
    // abstract 목적 : 상속 (extends) 설계 도구 (설계시 유연성은 떨어짐)

    int NUM = 10;  // public static final 자동 추가된다. (상수)
    // 인터페이스명.NUM 으로 바로 사용 가능, 상수라 변수명을 대문자로 작성 권장

    public int add(int num1,int num2);
            // 구현부 작성 X 접근제어자 public만 사용 가능
    // 설계가 목적이라 public abstract 자동으로 추가해준다.
}
