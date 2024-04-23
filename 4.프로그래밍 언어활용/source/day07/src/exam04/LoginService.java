package exam04;

public class LoginService {
    public void login(String userId, String userPw) //throws
    //  UserIdException, UserPwException { //전가해서 호출한 쪽이 예외 발생
    {
        // userId = user01, userPw = user123456 할당했을때 틀리면 예외처리 예
        try {
            if (!userId.equals("user01")) {
                throw new UserIdException("아이디가 일치하지 않습니다.");
            }
            if (!userPw.equals("123456")) {
                throw new UserPwException("비밀번호가 일치하지 않습니다.");
            }
            System.out.println("로그인 성공!");
        } catch (UserIdException | UserPwException e) {
            System.out.println(e.getMessage());
//            "비밀번호가 일치하지 않습니다.","아이디가 일치하지 않습니다."가
//             e.getMessage로 유입된다.
        }

    }
}


