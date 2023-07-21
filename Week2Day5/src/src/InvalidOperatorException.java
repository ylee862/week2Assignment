package src;

public class InvalidOperatorException extends Exception{
    public InvalidOperatorException() {
        super("존재하지 않는 연산자입니다");
    }
}
