package exam01;


public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
//        s1.year = 2024;
//        s1.month =2;
//        s1.day =3;
        Schedule _this = s1.returnThis();
        System.out.println(_this == s1);  // this 의 주소 값과 s1 가지고 있는 주소값이 같다.

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        s1.printThis();  // exam01.Schedule@3b07d329  , 클래스명/16진수로 표현한 객체주소
//        System.out.println(s1);  //exam01.Schedule@3b07d329
        s1.returnThis();
        s1.showDate();
    }
}
