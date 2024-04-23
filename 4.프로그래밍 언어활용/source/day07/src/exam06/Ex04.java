package exam06;

public class Ex04 {
    public static void main(String[] args) {
        String str = new String("ABC");
        String str2 = new String("ABC");
        System.out.printf("str1 == str2: %s%n",str==str2);
        // 동일성 비교
        System.out.printf("str1.equals(str2): %s%n",str.equals(str2));
        // 동등성 비교
    }
}
