package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
    Calculator cal = outer.method(30); //익명 return 주소값 대입
        int result = cal.add(10,20);
        System.out.println(result);
        int result2 = cal.add(10,30);
        System.out.println(result2);
    }
}
