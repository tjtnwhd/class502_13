package exam01;

public class Outer {
   //    지역변수 (스택영역생성), 객체 생성 완료 (힙영역 생성)
    private Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public Calculator method(int num3) { // 상수화
        return new Calculator() {
    // 반환값, 바로 주소값을 내보내기 위해서 익명 변수로 return 한다.
            // 공간 낭비
            public int add(int num1, int num2) {
//         num3 = 100; 지역변수의 상수화 final int num3...
                return num1 + num2 + num3;
            }
        };

    }
}