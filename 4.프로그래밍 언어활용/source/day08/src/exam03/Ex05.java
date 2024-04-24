package exam03;
//  Integer Wrapper 객체 사용 / 객체끼리는 연산 불가, 기본형만 연산 가능
public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);

    int result1 =num1 + num2;  // num2.intValue() 컴파일러가 객체 안에 값을 빼내온다.(언박싱)
        System.out.println(result1);
        // 연산이 객체끼리는 안되지만 컴파일러가 자동으로 변환 해준다.

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(200);

        int result2 = num3 + num4;
        System.out.println(result2);
    }

}
