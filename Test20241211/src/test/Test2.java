package test;

public class Test2 {

	public static void main(String[] args) {
		//String => 문자열 변경, 연결 => 기억장소에 새롭게 할당
		//=> 문자열 변경 작업이 많아지면 기억장소(메모리) 낭비
		
		//StringBuffer, StringBuilder
		//=> 문제를 해결 final 없음 => 값 변경 바로 적용
		
		StringBuffer buffer = new StringBuffer("java");
		System.out.println(buffer);
		buffer.append(" and");
		System.out.println(buffer);
		
	}

}
