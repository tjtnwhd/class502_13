package exam03;
// String 클래스의 유용한 메서드
public class Ex01 {
    public static void main(String[] args) {
        String fruit = String.join(",","Apple","Orange","Melon");
        System.out.println(fruit);

        String str = String.format("%d + %d = %d",10,20,30); // 형식화된 문자열로 반환
        System.out.println(str);
    }
}
