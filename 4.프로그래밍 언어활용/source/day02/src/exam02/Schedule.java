package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){
        year = _year;
    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int _month){
        month = _month;
    }
    public void setDay(int _day){
        // 통제 가능한 수단을 제공
        if(month == 2 && _day > 28){
            _day = 28;
        }
        day = _day;
    }


    void showDate(){
        System.out.printf("year=%d, month=%d, day=%d%n",year,month,day);
    }
}
