package exam03;
 // valueOf 사용 예제
public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(100);
        Integer num3 = Integer.valueOf(1000000000);
        Integer num4 = Integer.valueOf(1000000000);
        System.out.printf("num1 주소 : %d%n",System.identityHashCode(num1));
        System.out.printf("num2 주소 : %d%n",System.identityHashCode(num2));
        System.out.printf("num3 주소 : %d%n",System.identityHashCode(num3));
        System.out.printf("num4 주소 : %d%n",System.identityHashCode(num4));
//       Integer의 생성자를 사용하면 값은 같은데 주소가 달라 자원 낭비
//       valueOf를 사용하면 값이 같으니 주소가 같다. 숫자가 커지면 주소값이 알아서 변경
   }
}
