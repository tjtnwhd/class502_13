package exam06;

public class Ex05 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = new String("ABC");

        boolean result = isSame(str1,str2);
        System.out.printf("result = %s%n",result);
         // result = false

        System.out.println("str1 : "+System.identityHashCode(str1));
          // 주소 : str1 : 1149319664
        System.out.println("str2 : "+System.identityHashCode(str2));
          // 주소 : str2 : 668386784
    }
    public static boolean isSame(String str1,String str2){
//     return str1 ==str2; // String은 동일성 비교 사용 X

        return str1.equals(str2);
        // result = true  // 동등성 비교 사용 O


    }
}
