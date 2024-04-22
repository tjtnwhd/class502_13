package exam13;
// 인터페이스, 추상 클래스가 객체가 되는 조건(지역내부,맴버변수에서 객체 생성)
public class Outer {
    public Calculator method(int num3){
        Calculator cal = new Calculator() {
            public int add(int num1, int num2){
//              num3 = 100; / final int num3 - 지역변수의 상수화
        // 지역변수 num3이 return문(반환값) 만나면 소멸되야하지만
        // num은 힙영역메모리가 아니라 데이터영역 메모리에 할당되서 * 상수화 *가 된다.
        // 상수화로 인해 제거하지 않으려고 사용한다.

                return num1 + num2 + num3;
                // 완전한 객체 생성
            }
        };
//        int result = cal.add(10,20);
//        System.out.println(result);
        return cal;  // 반환값 상태로 내보내서 외부에서 접근 가능
    }
}
