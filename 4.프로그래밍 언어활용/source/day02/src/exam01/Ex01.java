package exam01;

public class Ex01 {
    public static void main(String[] args) {
       // s1 : 참조변수, Student : 참조 자료형
        Student s1 = new Student();  // 생성자 함수

        s1.id =1000;  // 인스턴스 변수
        s1.name = "이이름";
        s1.subject = "자바";
//        System.out.println(s1.id);
        s1.study();  // 인스턴스 메서드
        
        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "김이름";
        s2.subject = "자바스크립트";
        s2.study();
        System.out.println(s2 == s1); // 서로 주소값이 다른 객체이다.

        Student s3 = s2;  // 주소값 대입
        s3.name = "(수정)김이름";
        s3.study();  // s2와 주소가 같다.
        s2.study();   // s3와 주소가 같다.
        System.out.println(s3 == s2);


        s1 = null;  // 주소의 연결을 끊어서 자원에 접근을 못한다.
        s1.study();
    }
}
