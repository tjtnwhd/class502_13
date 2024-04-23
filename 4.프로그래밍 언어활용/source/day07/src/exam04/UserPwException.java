package exam04;
// Exception을 상속
// 컴파일러가 엄격한 체크
//RuntimeException이 유연성이 좋아서 많이 사용(코드 가독성 좋아짐)
// 하지만 실행중에 발생하면 멈추니 조심해서 사용
public class UserPwException extends RuntimeException{
    public UserPwException(String message){
        super(message);
    }
}
