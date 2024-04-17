package exam01;

public class Q4JAVA {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            System.out.println(i+"단=============");
            for(int j=2; j <=9; j++){
                if(i>j){
                    continue;
                }
            System.out.printf("%dX%d=%d%n",i,j,i*j);
            }
        }
    }
}
