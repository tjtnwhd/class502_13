package exam01;

public class Ex05 {
    public static void main(String[] args) {
        //   반복문(do, do~while,사용 예제)
//        int total = 0;
//        int num = 0;

        int total =0, num = 0;  // 동일한 자료형일때 여러 변수 선언 가능 *(초기값)*

        while (num <= 100){  //    * 조건식 * - 반복을 멈추는 조건
            total += num;  // total = total + num; 과 동일
            num++;  // num = num+1 과 동일  //  * 증감식 *
        }
        System.out.println("합계 : "+total);

    }

}
