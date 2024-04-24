package exam02;

public class Ex03 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));

    str += "DEF";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));

    str += "GHI";
        System.out.printf("str 주소 : %d%n",System.identityHashCode(str));
    }
}
//- 문자열은 불변하는 특징 ( final 상수 )
//- 기존 문자열에 새로운 문자열을 추가 하면 기존에있던 주소가 불변하는 공간이기때문에 새로운 주소 변경