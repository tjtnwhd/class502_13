package exam01;

public class Ex01 {
    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
//        Calculator cal = new SimpleCalculator(); // 다형성
         int result = cal.add(10,20);
        System.out.println(result);

        Calculator ccl = new ComplexCalculator();
        int result2 = ccl.add(10,20);
        System.out.println(result2);

    }
}
