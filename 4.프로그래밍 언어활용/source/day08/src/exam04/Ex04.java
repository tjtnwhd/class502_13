package exam04;

import java.util.Objects;

// Objects 클래스 관련 편의 기능
public class Ex04 {
    public static void main(String[] args) {
        String str = null;

        str = Objects.requireNonNullElse(str,""); // 예외 발생

        str.toUpperCase(); // NullPointerException (NPE) : 발생
    }
}
