package test;

//사용자 정의 예외타입
public class IDFormatException extends Exception {
	
	public IDFormatException(String message) {
		super(message);
	}
}
