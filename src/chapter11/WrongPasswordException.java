package chapter11;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){}

    public WrongPasswordException(String message){//자동 생성자 사용하기.
        super(message);
    }

}
