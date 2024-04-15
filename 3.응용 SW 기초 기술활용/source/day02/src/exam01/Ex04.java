package exam01;
public class Ex04 {


    public static void main(String[] args) {

        int floor = 8;   // switch 선택문 사용
        switch (floor) {
            case 1:
                System.out.println("1층 약국");
                break;
            case 2:
                System.out.println("2층 정형외과");
                break;
            case 3:  // floor = 3; 이라서 시작지점
                System.out.println("3층 피부과");
                break;
            case 4:
                System.out.println("4층 치과");
                break;   // 실행 흐름 종료
            case 5:
                System.out.println("5층 헬스클럽");
                break;
            default:
                System.out.println("없는 층입니다.");
        }


    }
}
