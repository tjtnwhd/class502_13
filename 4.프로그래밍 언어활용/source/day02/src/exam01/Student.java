package exam01;

public class Student {
    // 기본 생성자(Default 생성자) 컴파일러가 자동 생성(추가)
     //   생성자 오버로드
        public Student(){
            id =1000;
            name = "이이름";
            subject = "자바";
        }
    public Student(int _id, String _name, String _subject){
//          // 객체가 생성된 이후 실행 코드
            // 사용자가 반환값을 통제 못함, 내부적으로 통제하는중
        System.out.println("객체 생성 이후 실행");
 // 실행 시점 - id,name,subject 에 공간을 할당 받은 상태에서 실행.(이미 변수가 객체가 되어있는 상태)

      //    인스턴스 변수의 초기화 작업을 주로 수행
//           id = 1000;
//           name = "이이름";
//           subject = "자바";

        // 힙스택 영역에서 할당받는 지역변수
            id = _id;
            name = _name;
            subject = _subject;
    };

    int id;  // 학번  (힙 영역 메모리에 할당)
    String name; // 이름   (힙 영역 메모리에 할당)
    String subject; // 과목   (힙 영역 메모리에 할당)

    void study(){  //  void 메서드는 return 생략 가능
        System.out.printf("학번:%d, %s가 %s를 공부한다.%n",id,name,subject);
        //   1) 객체 생성, 2) 호출 - 호출 시점에는 인스턴스 변수가 이미 공간 할당됨
    }
}
