package exam01;

public class Ex06 {
    public static void main(String[] args) {
        //   for 문 사용 예제
            int total = 0;
        int i = 0, j = 10;
        for(; ; i++,j+=2){  // 초기화, 조건식, 증감식 순
            System.out.println("j : " + j);
            total += i;
            if(i > 100){
                break;
            }
        }
            System.out.println("합계 : "+ total);
    }
}


/*
        횟수, 순서(index)
관례적으로 초기화식 변수명 i 부터 시작하고 다음 알파벳 부터 순서대로 사용
i, j, k, l ....

// for (; ;) { } == while(true) {...}
*/