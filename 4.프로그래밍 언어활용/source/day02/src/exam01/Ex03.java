package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름","자바");
        s1.study();  // 객체가 되면 실행되는 함수

       Student s2 = new Student(1000, "이이름", "자바");
       s2.study();


        System.out.println(System.identityHashCode(s1));  // 객체 주소(가상의 주소)

    }

}
