package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"이이름","자바");
        Student s2 = new Student(1001,"김이름","리액트");
        // 변수공간이 하나만 할당되있어서 마지막으로 할당한 id,name,subject 값이 들어간다(공유)
        // static 변수 id 는 데이터 클래스에 4byte으로 바로 할당된다.


        System.out.println("s1 : "+ s1);
        System.out.println("s2 : "+ s2);
        System.out.println(s1.id);  // Student.id  (클래스명으로 접근하는게 좋다.)
        System.out.println(s2.id); // Student.id  (클래스명으로 접근하는게 좋다.)

        s1.instanceMethod();
    }
}
