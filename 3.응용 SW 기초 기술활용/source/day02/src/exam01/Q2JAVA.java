package exam01;

public class Q2JAVA {
    public static void main(String[] args) {
        for(int i=1; i<=40; i++){
            int roomNum = i%10;
            System.out.printf("학생%d,방번호%d%n",i,roomNum);
        }
    }
}
