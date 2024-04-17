package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public Schedule(){
        this(2024,4,17); // 생성자 첫줄에서만 사용 가능, 생성자 함수 접근할때
//        year = 2024;
//        month = 4;
//        day = 17;
    }

    public Schedule(int year, int month, int day){
        this.year =year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year; // this.year(힙 영역) , year (스택영역)
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(this.month == 2 && day > 28){
            day =28;
        }
    // this : 지역변수
        this.day = day;
    }

    void showDate() {
        System.out.printf("year=%d,month=%d,day=%d%n", year, month, day);
//     System.out.printf("year=%d,month=%d,day=%d%n", this.year, this.month, this.day);
    }  // 함수안에서 객체의 자원을 접근해서 사용하기 위해 this 사용한다. 명확할땐 this 생략가능
    public void printThis(){
        System.out.println(this);
    }
    public Schedule returnThis(){
        return this;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
