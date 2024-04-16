package exam02;

public class Ex01 {
    public static void main(String[] args) {
        //   같은 패키지에서는   (exam02.Ex01)   패키지명 생략 가능 ,
        Schedule s1 = new Schedule();
//         s1.year = 2024;
//        s1.month = 2;
//        s1.day = 31;  // 변수에 직접 대입하는것을 지양, * 통제 * 가 불가 하므로

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(31);

        int month = s1.getMonth();
        System.out.println(month);

        int day = s1.getDay();
        System.out.println(day);

        s1.showDate();



    }
}
