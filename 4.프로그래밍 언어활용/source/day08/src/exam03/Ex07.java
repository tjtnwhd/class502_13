package exam03;

public class Ex07 {
    public static void main(String[] args) {
        double result = add(10.0,10L);
        System.out.println(result);
    }
    public static double add(Number num1,Number num2){
        //매개변수에 기본자료형 어떤게 들어오든 double로 반환한다.
        return num1.doubleValue() + num2.doubleValue();

    }
}
