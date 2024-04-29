package exam04;

import java.util.Stack;
 // push, pop
public class Ex02 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("이름1");// push : 끝에 추가
        names.push("이름2");
        names.push("이름3");

        System.out.println(names.pop()); // 이름3  pop : 요소 꺼내기
        System.out.println(names.pop()); // 이름2
        System.out.println(names.pop()); // 이름1
    }
}
