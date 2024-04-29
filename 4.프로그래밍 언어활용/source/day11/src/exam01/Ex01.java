package exam01;

public class Ex01 {
    public static void main(String[] args) {
//        Box<Apple> appleBox = new Box<Apple>();
        Box<Apple> appleBox = new Box();
        appleBox.setItem(new Apple());
//        appleBox.setItem(new Grape()); // 타입 안정성 확보, Grape X


        Apple apple = appleBox.getItem(); // 형변환 X
        System.out.println(appleBox);
    }
}
