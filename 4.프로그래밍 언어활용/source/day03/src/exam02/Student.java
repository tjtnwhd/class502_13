package exam02;

public class Student {
    public static int id;
    private static String name;
    private static String subject;

    public Student(int id, String name, String subject){
        this.id = id;
        this.name = name;
        this.subject = subject;

    }
    public static void staticMethod(){  //  this 지역 변수 X -> 객체의 자원 접근 불가
        System.out.println("정적 메서드!!");
        // 정적 자원만 접근 가능 (statin 변수,메서드)

    }

    public  void instanceMethod(){  // this 지역변수 0  -> 객체 자원 접근 가능
        System.out.println("인스턴스 메서드!!");
        System.out.println(this.name);
        // 정적 자원은 객체 생성 이전부터 존재하므로 접근 가능
        staticMethod();
        id = 1000;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
