package exam02;

public class Ex02 {
    public static void main(String[] args) {
// 리터럴 상수와 같은 문자열 상수, 한가지만 가지고 모든걸 공유하기 때문 (메모리 소비를 줄임)
        String s1 = "ABC";  // 힙영역 - 문자열 상수 풀
        String s2 = "ABC";  // 힙영역 - 문자열 상수 풀

        System.out.printf("s1 == s2 : %s%n",s1==s2);
        System.out.printf("s1 주소 : %s%n",System.identityHashCode(s1));
        System.out.printf("s2 주소 : %s%n",System.identityHashCode(s2));
    }
}
