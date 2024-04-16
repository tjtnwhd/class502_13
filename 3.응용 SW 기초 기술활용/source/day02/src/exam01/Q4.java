package exam01;

public class Q4 {
    public static void main(String[] args) {
             // 구구단을 홀수만 출력 하시오.
        for(int i = 1; i<=9; i++){
            if(i%2 ==1){
                continue;
            }
            System.out.println(i+"단~~~~~~~~~~~~");
            for(int j=1; j <=9; j++){
                System.out.printf("%d X %d = %d%n",i,j,i*j);
            }
        }




//        for(int i =1; i<=9; i++){
//            if(i%2 ==0){
//                continue;
//            }
//            System.out.println(i+"단~~~~~~~~~~");
//            for(int j = 2; j <= 9; j++){
//                System.out.printf("%d X %d =%d%n",i,j, i*j);
//            }
//        }








//        for(int i = 2; i <=9; i++){
//            if(i%2 ==0){
//                continue;}  // 반복 조건을 건너뜀
//            System.out.println("단============");
//            for(int y = 1; y <= 9; y++){
//                System.out.printf("%d X %d = %d%n", i,y,i*y);
//            }
//
//
//        }
    }
}
