package exam05;
// Object의 최고조상의 다형성

public class Ex02 {
    public static void main(String[] args) {
        Object[] humans = new Human[2];
        humans[0] = new Human();
        humans[1] = new Tiger();
    }
}
