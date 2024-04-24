package exam02;
 // StringBuffer 사용예제 (동일한 객체 주소 동일, Buffer의 충분한 주소공간)
public class Ex04 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        sb.append("ABC");
        System.out.printf("sb 주소 : %d%n",System.identityHashCode(sb));
        sb.append("DEF");
        System.out.printf("sb 주소 : %d%n",System.identityHashCode(sb));
        sb.append("GHI");
        System.out.printf("sb 주소 : %d%n",System.identityHashCode(sb));

        String str = sb.toString();
        System.out.printf("sb 주소 : %d%n",System.identityHashCode(str));

        System.out.println(str);
    }
}
