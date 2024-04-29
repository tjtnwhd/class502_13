package exam03;

public class Box<T> { // 객체가 생성될때
    private T items;

    public void method(T str1, T str2){
        // 지네릭 클래스의 자료형 T : Box가 객체가 될때 T가 결정 된다.

    }

    public <T> void method2(T str1, T str2){
        // 지네릭 메서드 T : 호출시에 T의 자료형이 결정 돤다. (public <T>있을때)
    }
}
