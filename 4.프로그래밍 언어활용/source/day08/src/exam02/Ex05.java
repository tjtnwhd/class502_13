package exam02;
 // 메서드 체인 사용
public class Ex05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(100);
        String str = sb.append("ABC")// 메서드 체인
             .append("DEF") // 메서드 체인
             .append("GHI")// 메서드 체인
             .toString(); // 메서드 체인
        System.out.println(str);

//        StringBuffer sb2 = sb.append("ABC");
//        StringBuffer sb3 = sb.append("DEF");
//        System.out.println(sb);
    }
}
