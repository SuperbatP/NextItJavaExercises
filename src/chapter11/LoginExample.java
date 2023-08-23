package chapter11;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException  {
        if (!id.equals("blue")) {//맞는 아이디가 아니면 예외 발생
        throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }
        if (!password.equals("12345")) {//비번이 틀리면 예외 발생
        throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
