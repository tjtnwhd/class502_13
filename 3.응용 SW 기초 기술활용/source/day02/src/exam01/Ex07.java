package exam01;

public class Ex07 {

    public static void main(String[] args) {
        // 중첩 반복문 사용 예제
        for(int i = 2; i<= 9; i++){
            System.out.println(i + "단 ===========");
            for(int j = 1; j <=9; j++){
//                System.out.println(i+"X"+j+"="+(i*j));
                System.out.printf("%d X %d = %d%n", i, j, i*j);
//
//                  System.out.println(); //  =  \n = 줄개행
            }
        }

    }
}
