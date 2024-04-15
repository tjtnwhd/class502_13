package exam01;

public class Q5 {
            // 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력
    public static void main(String[] args) {
        for(int i=2; i <=9; i++){
            System.out.println("단===============");
            for(int y=1; y<=9; y++){
                if(i >y ){
                    continue;
                }
                System.out.printf("%d X %d = %d%n", i,y,i*y);

            }
        }
    }
}
