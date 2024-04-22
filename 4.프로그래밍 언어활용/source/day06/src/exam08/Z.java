package exam08;
// 하위클래스에 구현부를 정의할거라 다중상속이 가능하다
public interface Z extends X,Y{
    // interface는 다중상속 O / 중복되도 구현부가 없으니까
    void method3();
}
