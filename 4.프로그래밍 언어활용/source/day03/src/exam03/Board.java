package exam03;

public class Board {
    //  싱클톤 패턴 (생성자를 외부에서 직접 호출 X. 접근 제어자 private 변경)

    private static Board instance = new Board();

    private Board(){}


    public static Board getInstance(){
        return instance;
    }
}
