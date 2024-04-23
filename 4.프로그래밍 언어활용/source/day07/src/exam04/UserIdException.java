package exam04;
// Exception을 상속
public class UserIdException extends RuntimeException{
    public UserIdException(String message){
        super(message);
    }
}
